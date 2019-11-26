package assignment.assignment191024;

public class StudentManager {

	Student[] students = new Student[100];
	int count = 0;

	public void insertStudent(String name, String phoneNumber, int regNum) {
		Student student = new Student(name, phoneNumber, regNum);
		students[count] = student;
		count++;
	}

	public Student findStudent(int regNum) {
		Student findStudent = null;
		try {
			for (Student student : students) {
				if (student.regNum == regNum) {
					findStudent = student;					
				}
			}
		} catch (NullPointerException e) {
		}
		return findStudent;
	}

	public Student findStudent(String name, String phoneNumber) {
		Student findStudent = null;
		try {
			for (Student student : students) {
				if (student.name.equals(name) && student.phoneNumber.equals(phoneNumber)) {
					findStudent = student;					
				}
			}
		} catch (NullPointerException e) {
		}
		return findStudent;
	}
}
