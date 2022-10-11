package Classes;

public class Product {
    private String name;
    private Category category;
    private float price;

    public Product() {
        this.name = "DefaultProduct";
        this.category = new Category();
        this.price = 1.0f;
    }

    public Product(String name, Category category, float price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return name + " " + category + " " + price;
    }
}
