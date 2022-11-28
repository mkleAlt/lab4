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
            ProductValidator.getInstance().validate(name);
            this.name = name;
            return this;
        }

        public Builder category(Category category) {
            ProductValidator.getInstance().validate(category);
            this.category = category;
            return this;
        }

        public Builder price(float price) {
            ProductValidator.getInstance().validate(price);
            this.price = price;
            return this;
        }

        public Builder currency(Currency currency) {
            ProductValidator.getInstance().validate(currency);
            this.currency = currency;
            return this;
        }

        public Product build() {
            return new Product(this);
        }

        public static class ProductValidator {
            private final static ProductValidator instance = new ProductValidator();

            public static ProductValidator getInstance() {
                return instance;
            }

            public static boolean validate(String name) {
                if(!nullValidator(name)) {
                    return false;
                } else if(!lengthValidator(name)) {
                    return false;
                } else {
                    return true;
                }
            }

            public static boolean validate(Category category) {
                if(!nullValidator(category)) {
                    return false;
                } else {
                    return true;
                }
            }

            public static boolean validate(float price) {
                if(!negativeValueValidator(price)) {
                    return false;
                } else {
                    return true;
                }
            }

            public static boolean validate(Currency currency) {
                if(!nullValidator(currency)) {
                    return false;
                } else {
                    return true;
                }
            }

            public static boolean lengthValidator(String name) {
                if(name.isEmpty()) {
                    throw new IllegalArgumentException("Argument nie może być pusty");
                } else {
                    return true;
                }
            }

            public static boolean nullValidator(String name) {
                if(name == null) {
                    throw new IllegalArgumentException("Argument nie może mieć wartości NULL");
                } else {
                    return true;
                }
            }

            public static boolean nullValidator(Category category) {
                if(category == null) {
                    throw new IllegalArgumentException("Argument nie może mieć wartości NULL");
                } else {
                    return true;
                }
            }

            public static boolean nullValidator(Currency currency) {
                if(currency == null) {
                    throw new IllegalArgumentException("Argument nie może mieć wartości NULL");
                } else {
                    return true;
                }
            }

            public static boolean negativeValueValidator(float price) {
                if(price < 0) {
                    throw new IllegalArgumentException("Cena musi być większa od zera");
                } else {
                    return true;
                }
            }
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
