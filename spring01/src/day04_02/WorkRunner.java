package day04_02;

import org.springframework.beans.factory.BeanNameAware;

public class WorkRunner implements BeanNameAware { //BeanNameAware이 있다는 것은 setBeanName을 하겠다
	private String beanId;

	@Override
	public void setBeanName(String name) {
		this.beanId = name;
	}
	// 해당하는 ID를 찍게된다
	public void execute(Work work) {
		System.out.printf("%s --- WorkRunner[%s] execute Work[%d]\n", work, beanId, work.getOrder());
		work.run();
	}

}
