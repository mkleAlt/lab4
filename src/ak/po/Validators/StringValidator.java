package ak.po.Validators;

public class StringValidator {
    private final static StringValidator instance = new StringValidator();

    public static StringValidator getInstance() {
        return instance;
    }

    public static boolean validate(String name) {
        try {
            nullValidator(name);
            lengthValidator(name);
        } catch (IllegalArgumentException e) {
            throw e;
        }
        return true;
    }

    public static boolean lengthValidator(String name) {
        if(name.isEmpty()) {
            throw new IllegalArgumentException("Argument nie moze byc pusty");
        } else {
            return true;
        }
    }

    public static boolean nullValidator(String name) {
        if(name == null) {
            throw new IllegalArgumentException("Argument nie moze miec wartosci NULL");
        } else {
            return true;
        }
    }
}
