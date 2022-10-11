import Classes.Category;

import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Zadanie 5 - testowanie klas:");
        System.out.println("\nTesty klasy Category:");
        categoryTest();
    }

    public static void categoryTest() {
        Category cat = new Category();
        System.out.println("getName() test: " + cat.getName());
        System.out.print("setName() test - setting to \"null\": ");
        try {
            cat.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown - " + e.getMessage());
        }
        System.out.print("setName() test - setting to an empty string: ");
        try {
            cat.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown - " + e.getMessage());
        }
        cat.setName("Test");
        System.out.println("setName() test - setting to \"Test\": " + cat.getName());

        System.out.println("toString() test: " + cat.toString());
    }
}
