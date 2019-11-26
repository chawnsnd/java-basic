package assignment.assignment191119;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SchoolManager {

	ArrayList<Human> humanList = null;

	final String PATH = "bak.dat";

	public SchoolManager() {
		loadBackup();
	}
	
	public void loadBackup() {
		File file = new File(PATH);
		if (file.exists()) {
			try (FileInputStream fis = new FileInputStream(PATH); ObjectInputStream ois = new ObjectInputStream(fis);) {
				humanList = (ArrayList<Human>) ois.readObject();				
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			humanList = new ArrayList<Human>();
		}
	}

	public void saveBackup() {								
		File file = new File(PATH);
		try (FileOutputStream fos = new FileOutputStream(PATH); ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(humanList);
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}
	
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
