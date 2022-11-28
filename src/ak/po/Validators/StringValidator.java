package ak.po.Validators;

public class StringValidator {
    private final static StringValidator instance = new StringValidator();

    public static StringValidator getInstance() {
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
            throw new IllegalArgumentException("Argument nie moze być pusty");
        } else {
            return true;
        }
    }

    public static boolean nullValidator(String name) {
        if(name == null) {
            throw new IllegalArgumentException("Argument nie może miec wartosci NULL");
        } else {
            return true;
        }
    }
}
