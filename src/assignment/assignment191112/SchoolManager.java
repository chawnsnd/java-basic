package assignment.assignment191112;

import java.util.ArrayList;
import java.util.List;

public class SchoolManager {

	List<Human> humanList = new ArrayList<>();

	public boolean insertHuman(Human human) {
		for (Human tempHuman : humanList) {
			if (tempHuman.getSn().equals(human.getSn()))
				return false;
		}
		if (human instanceof Student) {
			for (Human tempHuman : humanList) {
				if (tempHuman instanceof Student)
					if (((Student) tempHuman).getSsn().equals(((Student) human).getSsn()))
						return false;
			}
		}
		return humanList.add(human);
	}

	public void printAll() {
		for (Human tempHuman : humanList) {
			tempHuman.print();
			System.out.println();
		}
	}

	public Human findHuman(String num) {
		for (Human tempHuman : humanList) {
			if (tempHuman.getSn().equals(num))
				return tempHuman;
		}
		return null;
	}

	public boolean deleteHuman(Human human) {
		return humanList.remove(human);
	}
}
