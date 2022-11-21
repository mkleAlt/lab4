package ak.po.Entities;

import ak.po.Entities.Category;
import ak.po.Enums.Currency;

public class Product {
    private String name;
    private Category category;
    private float price;
    private Currency currency;

    public Product() {
        this("DefaultProduct", Category.from(" "), 1.0f, Currency.PLN);
    }

    public Product(String name, float price) {
        this(name, Category.from(" "), price, Currency.PLN);
    }

    public Product(String name, Category category, float price) {
        this(name, category, price, Currency.PLN);
    }

    public Product(String name, Category category, float price, Currency currency) {
        try {
            this.setName(name);
            this.setPrice(price);
            this.setCategory(category);
            this.setCurrency(currency);
        } catch (IllegalArgumentException e) {
            this.name = null;
            this.category = null;
            this.price = 0.0f;
            this.currency = null;
            throw e;
        }
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

    public Currency getCurrency() {
        return currency;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
    }

    public void setCategory(Category category) {
        if(category != null) {
            this.category = category;
        } else {
            throw new IllegalArgumentException("Category cannot be null");
        }
    }

    public void setPrice(float price) {
        if(price > 0.0f) {
            this.price = Math.round(price * 100) / 100;
        } else {
            throw new IllegalArgumentException("Price must be a positive value");
        }
    }

    public void setCurrency(Currency currency) {
        if(currency != null) {
            this.currency = currency;
        } else {
            throw new IllegalArgumentException("Currency cannot be null");
        }
    }

    @Override
    public String toString() {
        return name + " " + category + " " + price + " " + currency;
    }
}
