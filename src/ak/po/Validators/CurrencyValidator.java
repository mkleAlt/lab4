package ak.po.Validators;

import ak.po.Enums.Currency;

public class CurrencyValidator {
    private final static CurrencyValidator instance = new CurrencyValidator();

    public static CurrencyValidator getInstance() {
        return instance;
    }

    public static boolean validate(Currency currency) {
        if(!nullValidator(currency)) {
            return false;
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
}
