package test;

public class HumanTmp {

//	private static final String TYPE = "animal";
	private static final String TYPE;
	// static �����ڵ� �� �ѹ� ����
	// class�� �޸𸮿� �ε��ϴ� ������ ó�� �ʱ�ȭ
	static {
		//����
		// Static field�� �ʱ�ȭ�ϴ� ����
		TYPE = "animal";
	}
	
	public static String getType() {
		return TYPE;
	}
	
	public HumanTmp(String name) {
	}
}
