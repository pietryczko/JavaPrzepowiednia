package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextLoader {
    public static ArrayList<String> getText() {
        ArrayList<String> przepowiednie = new ArrayList<>();
        File plik = new File("C:\\Users\\damia\\IdeaProjects\\untitled2\\src\\main\\java\\org\\example\\Przepowiednie");
        try {
            Scanner scanner = new Scanner(plik);
            while(scanner.hasNextLine()){
                przepowiednie.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku");
        }
        return przepowiednie;
    }
}
