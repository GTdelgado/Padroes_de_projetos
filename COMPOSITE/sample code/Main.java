package appplication;

import appplication.model.Component;
import appplication.model.File;
import appplication.model.Folder;

public class Main {

	public static void main(String[] args) {
		
		Component folderA = new Folder("A");
		folderA.add(new File("f1", 128.2f));
		folderA.add(new File("f2", 1024f));
		Component folderB = new Folder("B");
		folderA.add(folderB);
		folderB.add(new File("f3", 58.2f));
		folderB.add(new File("f4", 105.2f));
		folderB.add(new File("f5", 110.2f));
		
		System.out.println(folderA.getSize());
	}
}
