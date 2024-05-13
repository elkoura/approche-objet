package fichier;

import java.io.*;

public class CreerFichier {
	public static void main(String[] args) {
		String inputPath= "C:/Users/fouad/OneDrive/Documents/Java2024/approche-objet/src/fichier/recensement.csv";
		String outputPath = "C:/Users/fouad/OneDrive/Documents/Java2024/approche-objet/src/fichier/premieres_100_lignes.csv";
		
		try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {
			for (int i = 0; i < 100; i++) {
				String line = reader.readLine();
				if (line != null) {
					writer.write(line);
					writer.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
