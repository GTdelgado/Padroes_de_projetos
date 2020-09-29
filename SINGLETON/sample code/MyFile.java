import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFile {
	// private static MyFile instance = null;
	String filePath = "./src/file.txt";

	private static MyFile instance = null;

	private MyFile() {
		super();
	}

	public static MyFile getInstance() {
		if (instance == null) {
			synchronized (MyFile.class) {

			}
			if (instance == null) {
				instance = new MyFile();
			}
		}
		return instance;
	}

	public void read() {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	public void writeLine(String linha) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			bw.write(linha);
			bw.newLine();
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
