import ak.po.Classes.Category;
import ak.po.Classes.Product;

public class main {
    public static void main(String[] args) {
        System.out.println("Zadanie 5 - testowanie klas:");
        System.out.println("\nTesty klasy Category:");
        categoryTest();

        System.out.println("\nTesty klasy Product:");
        productTest();
    }

    public static void productTest() {
        Product prod = new Product();
        System.out.println("getName() test: " + prod.getName());
        System.out.print("setName() test - setting to \"null\": ");
        try {
            prod.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown - " + e.getMessage());
        }
        System.out.print("setName() test - setting to an empty string: ");
        try {
            prod.setName("");
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown - " + e.getMessage());
        }
        prod.setName("Test");
        System.out.println("setName() test - setting to \"Test\": " + prod.getName());

        System.out.println("getCategory() test: " + prod.getCategory());
        System.out.print("setCategory() test - setting to \"Test\": ");
        try {
            prod.setCategory(new Category("Test"));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown - " + e.getMessage());
        }
        System.out.println(prod.getCategory());

        System.out.println("getPrice() test: " + prod.getPrice());
        System.out.print("setPrice() test - setting to 0.0: ");
        try {
            prod.setPrice(0.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown - " + e.getMessage());
        }
        System.out.print("setPrice() test - setting to 1.0: ");
        try {
            prod.setPrice(1.0f);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception thrown - " + e.getMessage());
        }
        System.out.println(prod.getPrice());

        System.out.println("toString() test: " + prod.toString());
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
