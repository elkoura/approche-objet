package fichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectureFichier {

	public static void main(String[] args) {

		String path = "C:/Users/fouad/OneDrive/Documents/Java2024/approche-objet/src/fichier/recensement.csv";
		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
