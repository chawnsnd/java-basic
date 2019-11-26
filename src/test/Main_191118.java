package test;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main_191118 {

	public static void main(String[] args) {

		Child child = new Child("LEE", 22);

		String path = "/home/junwoong/sesoc/IT/fio/child.dat";
		try (FileOutputStream fos = new FileOutputStream(path);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(path);
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			oos.writeObject(child);
			Child child2 =  (Child) ois.readObject();
			System.out.println(child);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
