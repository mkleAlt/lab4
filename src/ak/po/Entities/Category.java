package ak.po.Entities;

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
            CategoryValidator.validate(name);
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

    public static class CategoryValidator {
        private final static CategoryValidator instance = new CategoryValidator();

        public static CategoryValidator getInstance() {
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
    }
}
