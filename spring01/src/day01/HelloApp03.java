package day01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class HelloApp03 {
	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/day01/beans.xml"));
		MessageBean bean = (MessageBean) factory.getBean("messageBean");
		bean.sayHello();
	}

}
