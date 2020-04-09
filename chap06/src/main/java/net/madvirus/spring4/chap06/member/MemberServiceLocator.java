package net.madvirus.spring4.chap06.member;

public class MemberServiceLocator {
	//class라서 proxy-target-class가 true가 되어야 한다. 
	private MemberServiceImpl memberService;
	
	public MemberServiceImpl getMemberService(){
		return memberService;
	}
	public void setMemberService(MemberServiceImpl memberService){
		this.memberService = memberService;
	}

}
