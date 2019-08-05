package day04_03;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MainByPropOfXml {
	
	public static void main(String[] args) {
		usePropertyPlaceholder();
	}
	
	public static void usePropertyPlaceholder() {
		System.out.println("------ 1개 PropertyPlaceholder 사용");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:/day04_03/db-config.xml");
		ConfigurableEnvironment env = ctx.getEnvironment();
		
		System.out.println(env.getProperty("java.version"));
		ctx.close();
	}

}
