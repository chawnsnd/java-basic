package assignment.assignment191028;

public class Hangle {
	
	static String[] hanNumArr1 = {
									"��", "��", "��", 
									"��", "��", "��", 
									"��", "ĥ", "��", "��"
								 };
	static String[] hanNumArr2 = {
									"��", "�ϳ�", "��", 
									"��", "��", "�ټ�", 
									"����", "�ϰ�", "����", "��ȩ"
								 };

	public static int toNum(String inputHan) {
		String[] inputHanArr = inputHan.split("");
		String resStr = "";
		for (int i=0; i<inputHanArr.length; i++)
			for(int j=0; j<hanNumArr1.length; j++)
				if (inputHanArr[i].equals(hanNumArr1[j]) || inputHanArr[i].equals(hanNumArr2[j]))
					resStr += Integer.toString(j);

		return Integer.parseInt(resStr);
	}
}