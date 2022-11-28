import ak.po.Entities.Category;
import ak.po.Entities.Product;
import ak.po.Enums.Currency;

import static ak.po.Enums.Currency.*;

public class main {
    public static void main(String[] args) {
        System.out.println("\nTesty Category: ");
        categoryTest();
        System.out.println("\nTesty Product: ");
        productTest();
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

    public static void productTest() {
        System.out.println("Inicjalizowanie poprawnego produktu");
        Product prod = new Product.Builder()
                .name(" ")
                .category(Category.from(" "))
                .price(0.0f)
                .currency(PLN)
                .build();
        System.out.println("toString: " + prod);
        System.out.println("Testy wyjatkow: ");
        try {
            Product prod1 = new Product.Builder()
                    .name(null)
                    .category(Category.from(" "))
                    .price(0.0f)
                    .currency(PLN)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Test 1 validatora dla typu string - null: " + e.getMessage());
        }

        try {
            Product prod1 = new Product.Builder()
                    .name("")
                    .category(Category.from(" "))
                    .price(0.0f)
                    .currency(PLN)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Test 2 validatora dla typu string - emptyString: " + e.getMessage());
        }

        try {
            Product prod1 = new Product.Builder()
                    .name(" ")
                    .category(null)
                    .price(0.0f)
                    .currency(PLN)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Test validatora dla typu category - null: " + e.getMessage());
        }

        try {
            Product prod1 = new Product.Builder()
                    .name(" ")
                    .category(Category.from(" "))
                    .price(-1.0f)
                    .currency(PLN)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Test validatora dla typu float - negativeValue: " + e.getMessage());
        }

        try {
            Product prod1 = new Product.Builder()
                    .name(" ")
                    .category(Category.from(" "))
                    .price(0.0f)
                    .currency(null)
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("Test validatora dla typu currency - null: " + e.getMessage());
        }
    }
}
