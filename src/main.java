import ak.po.Entities.Category;
import ak.po.Entities.Product;
import ak.po.Enums.Currency;

public class main {
    public static void main(String[] args) {
        System.out.println("Zadanie 6 - testowanie entities:");
        System.out.println("\nTesty Category:");
        categoryTest();

        System.out.println("\nTesty Product:");
        productTest();
    }

    public static void productTest() {
        Product prod = new Product();
        System.out.println("Test getterow na pustym obiekcie stworzonym przez bezargumentowy konstruktor:");
        System.out.println("Name: " + prod.getName());
        System.out.println("Category: " + prod.getCategory());
        System.out.println("Price: " + prod.getPrice());
        System.out.println("Currency: " + prod.getCurrency());
        System.out.println("\nTest setterow i toString na obiekcie:");
        prod.setName("TestName");
        prod.setCategory(new Category("TestCategory"));
        prod.setPrice(10.0f);
        prod.setCurrency(Currency.USD);
        System.out.println(prod.toString());
        System.out.println("\nTest konstruktorow 2, 3 i 4 argumentowych:");
        Product prod2 = new Product("TestName2", 20.0f);
        System.out.println(prod2.toString());
        Product prod3 = new Product("TestName3", new Category("TestCategory3"), 30.0f);
        System.out.println(prod3.toString());
        Product prod4 = new Product("TestName4", new Category("TestCategory4"), 40.0f, Currency.PLN);
        System.out.println(prod4.toString());
        System.out.println("\nTest konstruktorow 2, 3 i 4 argumentowych z wyjatkami:");
        try {
            Product prod5 = new Product(null, 50.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjatek - name: " + e.getMessage());
        }
        try {
            Product prod6 = new Product("TestName6", null, 60.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjatek - category: " + e.getMessage());
        }
        try {
            Product prod7 = new Product("TestName7", new Category("TestCategory7"), -70.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjatek - price: " + e.getMessage());
        }
        try {
            Product prod8 = new Product("TestName8", new Category("TestCategory8"), 80.0f, null);
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjatek - currency: " + e.getMessage());
        }
    }

    public static void categoryTest() {
        Category cat = new Category();
        System.out.println("Test getterow na pustym obiekcie stworzonym przez bezargumentowy konstruktor:");
        System.out.println("Name: " + cat.getName());
        System.out.println("Test setterow i toString na obiekcie:");
        cat.setName("TestName");
        System.out.println(cat.toString());
        System.out.println("Test wyjatku dla null w konstruktorze:");
        try {
            Category cat2 = new Category(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjatek: " + e.getMessage());
        }
        System.out.println("Test wyjatku dla pustego stringa w konstruktorze:");
        try {
            Category cat2 = new Category("");
        } catch (IllegalArgumentException e) {
            System.out.println("Wyjatek: " + e.getMessage());
        }
    }
}
