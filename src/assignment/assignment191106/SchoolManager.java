package assignment.assignment191106;

public class SchoolManager {

	Human[] humans = new Human[100];
	int count = 0;

	public boolean insertHuman(Human human) {
		for (int i = 0; i < count; i++) {
			if (humans[i].getNum().equals(human.getNum()))
				return false;
		}
		if (human instanceof Student) {
			for (int i = 0; i < count; i++) {
				if (humans[i] instanceof Student) {
					if (((Student) humans[i]).getStNum().equals(((Student) human).getStNum()))
						return false;
				}
			}
		}
		humans[count++] = human;
		return true;
	}

	public void printAll() {
		for (int i = 0; i < count; i++) {
			humans[i].print();
			System.out.println();
		}
	}
}
