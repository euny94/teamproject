package day02_02;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainBySensor {
	public static void main(String[] args) {
		useBean(new GenericXmlApplicationContext("classpath:day02_02/config-sensor.xml"));
	}
	private static void useBean(AbstractApplicationContext ctx) {
		
		Sensor sensor1 = ctx.getBean("sensor1", Sensor.class);
		Sensor sensor2 = ctx.getBean("sensor2", Sensor.class);
		Monitor monitor = ctx.getBean("monitor", Monitor.class);
		
		System.out.println(sensor1);
		System.out.println(sensor2);
		System.out.println(monitor);
		
		ctx.close();
		
	}

}
