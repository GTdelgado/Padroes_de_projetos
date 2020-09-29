
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFile file1 = MyFile.getInstance();
		MyFile file2 = MyFile.getInstance();
		MyFile file3 = MyFile.getInstance();
		MyFile file4 = MyFile.getInstance();
		
		file1.writeLine("Testeasdasd1");
		file2.read();
		file3.writeLine("Testeadsasd3");
		file4.read();
		
		System.out.println(file1.hashCode());
		System.out.println(file2.hashCode());
		System.out.println(file3.hashCode());
		System.out.println(file4.hashCode());
	}

}
