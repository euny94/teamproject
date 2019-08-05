package day04_02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForScope {
	public static void main(String[] args) {
		useXml();
		useJava();
	}
	
	private static void useXml() {
		System.out.println("==== XML Meta ====");
		String configLocation = "classpath:day04_02/config-for-scope.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		
		WorkScheduler scheduler = ctx.getBean("workScheduler",WorkScheduler.class);
		scheduler.makeAndRunWork();
		
		ctx.close();
	}
	public static void useJava() {
		System.out.println("==== Java Meta ====");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigForScope.class);
		
		WorkScheduler scheduler = ctx.getBean("workScheduler",WorkScheduler.class);
		scheduler.makeAndRunWork();
		System.out.println("==== Java Meta ====");
		ctx.close();
	}
}
