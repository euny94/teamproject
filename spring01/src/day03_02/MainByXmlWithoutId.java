package day03_02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainByXmlWithoutId {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:day03_02/config-without-id.xml");
		String[] beanNames = ctx.getBeanDefinitionNames();
		for (String bn : beanNames)
			System.out.println(bn);
		ctx.close();
	}

}
