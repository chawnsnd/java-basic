package workbook02.q07;

import java.util.Arrays;

public class BreadManager {

	Bread[] breads = new Bread[100];
	int count = 0;

	public int insertBread(Bread bread) {
		for(int i=0; i<count; i++) {
			if (breads[i].getNum().equals(bread.getNum())) return -1;
		}
		breads[count++] = bread;
		return 1;
	}

	public Bread[] allBreads() {
		Bread[] copyBreads = Arrays.copyOf(breads, count);
		return copyBreads;
	}

	public void deleteBread(String num) {
		for(int i=0; i<count; i++) {
			if (breads[i].getNum().equals(num)) {
				for(int j=i; j<count; j++) {
					breads[j] = breads[j+1];
				}
				count--;
			}
		}
	}

	public Bread findBread(String num) {
		for(int i=0; i<count; i++){
			if (breads[i].getNum().equals(num)) {
				return breads[i];
			}
		}
		return null;
	}
}
