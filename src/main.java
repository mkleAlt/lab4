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
        Category cat = Category.from(" ");
        System.out.println("Test getterow na pustym obiekcie stworzonym przez bezargumentowy konstruktor:");
        System.out.println("Name: " + cat.getName());
        System.out.println("Test setterow i toString na obiekcie:");
        cat.setName("TestName");
        System.out.println(cat.toString());
        System.out.println("Test wyjatku dla null w konstruktorze:");
        try {
            Category cat2 = Category.from(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjatek: " + e.getMessage());
        }
        System.out.println("Test wyjatku dla pustego stringa w konstruktorze:");
        try {
            Category cat2 = Category.from(" ");
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjatek: " + e.getMessage());
        }
    }
}
