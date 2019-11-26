package assignment.assignment191030;

public class HumanManager {

	Human[] humans = new Human[100];
	int count = 0;

	public void insertStaff(String name, int age, String field) {
		Staff staff = new Staff(name, age, field);
		humans[count++] = staff;
	}

	public void insertStudent(String name, int age, int stNum) {
		Student student = new Student(name, age, stNum);
		humans[count++] = student;
	}

	public void showAll() {
		for (int i = 0; i < count; i++) {
			humans[i].showInfo();
		}
	}
}