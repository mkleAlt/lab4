package ak.po.Validators;

public class FloatValidator {
    private final static FloatValidator instance = new FloatValidator();

    public static FloatValidator getInstance() {
        return instance;
    }

    public static boolean validate(float price) {
        if(!negativeValueValidator(price)) {
            return false;
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
