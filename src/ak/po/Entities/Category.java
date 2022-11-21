package ak.po.Entities;

public class Category {
    private String name;

    private Category() {
        this.name = " ";
    }

    private Category(String name) {
        try {
            this.setName(name);
        } catch (IllegalArgumentException e) {
            this.name = null;
            throw e;
        }
    }

    public static Category from(String category) {
        return new Category(category);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty or null");
        }
    }

    @Override
    public String toString() {
        return "Category - " + this.name;
    }
}
