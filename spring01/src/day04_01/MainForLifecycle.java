package day04_01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForLifecycle {
	public static void main(String[] args) {
		useXml();
		useJava();
	}
	private static void useXml() {
		System.out.println("==== XML Meta ====");
		String configLocation = "classpath:day04_01/config-for-lifecycle.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		System.out.println("==== XML Meta ====");
		ctx.close();
	}
	private static void useJava() {
		System.out.println("==== Java Meta ====");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigForLifecycle.class);
		System.out.println("==== Java Meta ====");
		ctx.close();
	}

}
