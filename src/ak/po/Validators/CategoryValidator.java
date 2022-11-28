package ak.po.Validators;

import ak.po.Entities.Category;

public class CategoryValidator {
    private final static CategoryValidator instance = new CategoryValidator();

    public static CategoryValidator getInstance() {
        return instance;
    }

    public static boolean validate(Category category) {
        try {
            nullValidator(category);
        } catch (IllegalArgumentException e) {
            throw e;
        }
        return true;
    }

    public static boolean nullValidator(Category category) {
        if(category == null) {
            throw new IllegalArgumentException("Argument nie moze miec wartocci NULL");
        } else {
            return true;
        }
    }
}
