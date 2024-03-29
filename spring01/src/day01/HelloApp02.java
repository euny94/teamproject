package day01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HelloApp02 {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/day01/beans.xml"));
		MessageBean bean = factory.getBean("messageBean",MessageBean.class);
		bean.sayHello("Spring");
	}
}
