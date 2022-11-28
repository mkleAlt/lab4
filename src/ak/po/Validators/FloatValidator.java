package ak.po.Validators;

public class FloatValidator {
    private final static FloatValidator instance = new FloatValidator();

    public static FloatValidator getInstance() {
        return instance;
    }

    public static boolean validate(float price) {
        try {
            negativeValueValidator(price);
        } catch (IllegalArgumentException e) {
            throw e;
        }
        return true;
    }

    public static boolean negativeValueValidator(float price) {
        if(price < 0) {
            throw new IllegalArgumentException("Cena musi byc wieksza od zera");
        } else {
            return true;
        }
    }
}
