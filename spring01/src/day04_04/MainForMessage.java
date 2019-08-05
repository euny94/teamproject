package day04_04;

import java.util.Locale;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForMessage {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:day04_04/message-config.xml");
		
		System.out.println(ctx.getMessage("hello", null, Locale.getDefault()));
		System.out.println(ctx.getMessage("welcome", new String[] { "최범균","정말입니다."}, Locale.getDefault()));
		
		System.out.println(ctx.getMessage("hello", null, Locale.ENGLISH));
		System.out.println(ctx.getMessage("welcome", new String[] { "madvirus","really!!!"}, Locale.ENGLISH));
		
		ctx.close();
	}

}
