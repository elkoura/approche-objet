package fr.diginamic.recensement;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAccesscheck {
    public static void main(String[] args) {
        Path pathOri = Paths.get("C:\\Users\\fouad\\OneDrive\\Documents\\Java2024\\approche-objet\\src\\fr\\diginamic\\recensement\\recensement.csv");
        boolean fileExists = Files.exists(pathOri); // Vérifie si le fichier existe
        System.out.println("Le fichier est accessible: " + fileExists);
    }
}

