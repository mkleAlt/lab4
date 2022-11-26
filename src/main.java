import ak.po.Entities.Category;
import ak.po.Entities.Product;
import ak.po.Enums.Currency;

public class main {
    public static void main(String[] args) {
        System.out.println("Zadanie 6 - testowanie entities:");
        System.out.println("\nTesty Category:");
        categoryTest();
    }

    public static void categoryTest() {
        System.out.println("Test inicjalizowania kategorii metoda from: ");
        Category cat = Category.from(" ");
        if(cat != null) {
            System.out.println("Objekt został stworzony poprawnie");
        } else {
            System.out.println("Objekt nie został stworzony poprawnie");
        }
        System.out.println("Test getterow na pustym obiekcie stworzonym przez bezargumentowy konstruktor:");
        System.out.println("Name: \"" + cat.getName() + "\"");
        System.out.print("Test setterow i toString na obiekcie: ");
        cat.setName("TestName");
        System.out.println(cat.toString());
        System.out.println("Test wyjatku dla null w setterze: ");
        try {
            cat.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjatek: " + e.getMessage());
        }
        System.out.println("Test wyjatku dla pustego stringa w setterze:");
        try {
            cat.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjatek: " + e.getMessage());
        }
    }
}
