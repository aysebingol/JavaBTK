package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		int total = 0;
		try {
			reader = new BufferedReader(
					new FileReader("C:\\Users\\toshiba\\eclipse-workspace\\readingFileDemo\\src\\sayilar.txt"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				total += Integer.valueOf(line);
			}
			System.out.println("toplam = " + total);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			reader.close();
		}
	}

}
