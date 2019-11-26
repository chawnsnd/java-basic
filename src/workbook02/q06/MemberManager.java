package workbook02.q06;

public class MemberManager {
	
	private Member[] members = new Member[100];
	int count = 0;
	
	//등록
	public int insertMember(Member member) {
		for(int i=0; i<count; i++) {
			if(members[i].getNum().equals(member.getNum())) {
				return -1;
			}
		}
		members[count++] = member;
		return 0;
	} 
	
	//전체출력
	public Member[] allMembers() {
		Member[] tempMembers = new Member[count];
		for(int i=0; i<count; i++) {
			tempMembers[i] = members[i];
		}
		return tempMembers;
	}
}
