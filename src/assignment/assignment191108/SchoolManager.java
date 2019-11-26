package assignment.assignment191108;

public class SchoolManager {

	Human[] humans = new Human[100];
	int count = 0;

	public boolean insertHuman(Human human) {
		for (int i = 0; i < count; i++) {
			if (humans[i].getSn().equals(human.getSn()))
				return false;
		}
		if (human instanceof Student) {
			for (int i = 0; i < count; i++) {
				if (humans[i] instanceof Student) {
					if (((Student) humans[i]).getSsn().equals(((Student) human).getSsn()))
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

	public Human findHuman(String num) {
		for (int i = 0; i < count; i++) {
			if (humans[i].getSn().equals(num)) {
				return humans[i];
			}
		}
		return null;
	}

	public boolean deleteHuman(Human human) {
		for (int i = 0; i < count; i++) {
			if (humans[i] == human) {
				for (int j = i; j < count - 1;) {
					humans[j] = humans[j + 1];
					count--;
					return true;
				}
			}
		}
		return false;
	}
}
