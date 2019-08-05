package day05_01.sample;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainQuickStart {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =new GenericXmlApplicationContext("classpath:day05_01/sample/acQuick.xml");
		
		//write는 profile에 걸림, memberUpdateTraceAdvice에는 안걸림, readArticleService 도 안걸림
		WriteArticleService writeArticleService = ctx.getBean("writeArticleService", WriteArticleService.class);
		writeArticleService.wrtie(new NewArticleRequest("Writer", "title", "content"));
		
		System.out.println("*********************************************************************************");
		
		MemberService memberService = ctx.getBean(MemberService.class);
		MemberRegRequest memberRegReq = new MemberRegRequest("id", "name", "pw");
		memberService.regist(memberRegReq);
		
		System.out.println("*********************************************************************************");
		UpdateInfo updateInfo = new UpdateInfo();
		updateInfo.setNewName("새이름");
		memberService.update("madvirus", updateInfo);
		System.out.println("*********************************************************************************");
		
		ReadArticleService readArticleService = ctx.getBean(ReadArticleService.class);
		readArticleService.read(1);
		readArticleService.read(1);
		
		ctx.close();
	}

}
