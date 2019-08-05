package day05_01.sample;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainQuickStart {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx =new GenericXmlApplicationContext("classpath:day05_01/sample/acQuick.xml");
		
		WriteArticleService writeArticleService = ctx.getBean("writeArticleService", WriteArticleService.class);
		writeArticleService.wrtie(new NewArticleRequest("Writer", "title", "content"));
		MemberService memberService = ctx.getBean(MemberService.class);
		MemberRegRequest memberRegReq = new MemberRegRequest("id", "name", "pw");
		memberService.regist(memberRegReq);
		UpdateInfo updateInfo = new UpdateInfo();
		updateInfo.setNewName("새이름");
		memberService.update("madvirus", updateInfo);
		
		
		ReadArticleService readArticleService = ctx.getBean(ReadArticleService.class);
		readArticleService.read(1);
		readArticleService.read(1);
		
		ctx.close();
	}

}
