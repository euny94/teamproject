package day04_02;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class WorkScheduler implements ApplicationContextAware {
	private WorkRunner workRunner;
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx = applicationContext;
	}
	
	public void makeAndRunWork() {
		for (long order = 1; order <= 10; order++) {
			Work work = ctx.getBean("workProto", Work.class);
			//work.class 가 xml에서 prototype으로 정해져있기때문에 주소가 계속 달라진다.
			work.setOrder(order);
			workRunner.execute(work);
		}
	}
	//injection되는 대상
	public void setWorkRunner(WorkRunner workRunner) {
		this.workRunner = workRunner;
	}

}
