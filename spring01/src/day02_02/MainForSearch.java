package day02_02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainForSearch {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:day02_02/config-search.xml");
		SearchClientFactoryBean factory = ctx.getBean("searchClientFactory", SearchClientFactoryBean.class);
		System.out.println(factory);
		SearchClientFactoryBean factory2 = ctx.getBean("searchClientFactory", SearchClientFactoryBean.class);
		System.out.println("same instance =" + (factory == factory2));
		ctx.close();
	}

}
