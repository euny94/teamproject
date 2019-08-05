package day05_01.sample;

public interface MemberService {
	
	void regist(MemberRegRequest memberRegReq);
	
	boolean update(String id, UpdateInfo updateInfo);

}
