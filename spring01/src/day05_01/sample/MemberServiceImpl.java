package day05_01.sample;

public class MemberServiceImpl implements MemberService {

	@Override
	public void regist(MemberRegRequest memberRegReq) {
		System.out.println("MemberServiceInpl.regist() 호출됨");
	}

	@Override
	public boolean update(String id, UpdateInfo updateInfo) {
		System.out.println("MemberServiceImpl.update() 호출됨");
		return true;
	}
	


}
