package ak.po.Entities;

import ak.po.Validators.StringValidator;

public class Category {
    private String name;

    private Category() {
        this.setName(" ");
    }

    private Category(String name) {
        this.setName(name);
    }

    public static Category from(String category) {
        return new Category(category);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws IllegalArgumentException {
        try {
            StringValidator.getInstance().validate(name);
        } catch (IllegalArgumentException e) {
            this.name = null;
            throw e;
        }

        this.name = name;
    }

    @Override
    public String toString() {
        return "Category - " + this.name;
    }
}
