package day03_02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day02_01.AuthenticationService;
import day02_01.PasswordChangeService;

public class MainByJavaPackage {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("day03_02");
		AuthenticationService authSvc = ctx.getBean("authenticationService",AuthenticationService.class);
		authSvc.authenticate("bkchoi", "1234");
		PasswordChangeService pwChgSvc = ctx.getBean(PasswordChangeService.class);
		pwChgSvc.chaangePassword("bkchoi", "1234", "5678");
		ctx.close();
	}

}
