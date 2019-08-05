package day02_02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import day02_01.AuthenticationService;
import day02_01.PasswordChangeService;

public class MainAll {
	public static void main(String[] args) {
		useBean(new GenericXmlApplicationContext("classpath:day02_02/config-all.xml"));
	}
	private static void useBean(AbstractApplicationContext ctx) {
		AuthenticationService authSvc = ctx.getBean("authenticationService",AuthenticationService.class);
		authSvc.authenticate("bkchoi", "1234");
		PasswordChangeService psChgSvc = ctx.getBean(PasswordChangeService.class);
		psChgSvc.chaangePassword("bkchoi", "1234", "5678");
		Sensor sensor1 = ctx.getBean("sensor1", Sensor.class);
		Sensor sensor2 = ctx.getBean("sensor2", Sensor.class);
		Monitor monitor = ctx.getBean("monitor", Monitor.class);
		
		System.out.println(sensor1);
		System.out.println(sensor2);
		System.out.println(monitor);
		
		ctx.close();
		
	}

}
