package ak.po.Entities;

import ak.po.Entities.Category;
import ak.po.Enums.Currency;

public class Product {
    private final String name;
    private final Category category;
    private final float price;
    private final Currency currency;

    private Product(Builder builder) {
        this.name = builder.name;
        this.category = builder.category;
        this.price = builder.price;
        this.currency = builder.currency;
    }

    public static class Builder {
        private String name = null;
        private Category category = null;
        private float price = 0.0f;
        private Currency currency = null;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder category(Category category) {
            this.category = category;
            return this;
        }

        public Builder price(float price) {
            this.price = price;
            return this;
        }

        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public Product build() {
            return new Product(this);
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

    @Override
    public String toString() {
        return name + " " + category + " " + price + " " + currency;
    }
}
