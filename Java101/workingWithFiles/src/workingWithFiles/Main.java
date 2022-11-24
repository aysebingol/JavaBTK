package workingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// createFile();
		// getFileInfo();
		readFile();
		writeFile();
		readFile();
	}

	public static void createFile() {
		File file = new File("C:\\Users\\toshiba\\eclipse-workspace1\\files\\students.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("dosya oluştu");
			} else {
				System.out.println("dosya mevcut");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void getFileInfo() {
		File file = new File("C:\\Users\\toshiba\\eclipse-workspace1\\files\\students.txt");

		if (file.exists()) {
			System.out.println("Dosya adı = " + file.getName());
			System.out.println("Dosya yolu = " + file.getAbsolutePath());
			System.out.println("Dosya yazılabilir mi = " + file.canWrite());
			System.out.println("Dosya okunabilir mi = " + file.canRead());
			System.out.println("Dosya uzunluğu(byte) = " + file.length());
		}
	}

	public static void readFile() {
		File file = new File("C:\\Users\\toshiba\\eclipse-workspace1\\files\\students.txt");
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				System.out.println(line);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void writeFile() {
		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("C:\\Users\\toshiba\\eclipse-workspace1\\files\\students.txt", true));
			writer.write("Ömer");
			writer.newLine();
			System.out.println("dosyaya yazıldı");
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
