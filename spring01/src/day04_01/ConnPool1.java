package day04_01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ConnPool1 implements InitializingBean, DisposableBean {// 시작시 initializing 오브젝트(Bean)을 생성할때 

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("ConnPool1.afterPropertiesSet()");	
	} 
	@Override
	public void destroy() throws Exception {
		System.out.println("ConnPool1.destroy()");
	}
}
