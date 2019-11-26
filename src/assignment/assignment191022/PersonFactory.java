package assignment.assignment191022;

public class PersonFactory {
	public Person createPerson(String name, String gender, int age) {
		Person person = new Person(name, gender, age);
//		person.name = name;
//		person.gender = gender;
//		person.age = age;
		return person;
	}
}
