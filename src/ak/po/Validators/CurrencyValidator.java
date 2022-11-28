package ak.po.Validators;

import ak.po.Enums.Currency;

public class CurrencyValidator {
    private final static CurrencyValidator instance = new CurrencyValidator();

    public static CurrencyValidator getInstance() {
        return instance;
    }

    public static boolean validate(Currency currency) {
        try {
            nullValidator(currency);
        } catch (IllegalArgumentException e) {
            throw e;
        }
        return true;
    }

    public static boolean nullValidator(Currency currency) {
        if(currency == null) {
            throw new IllegalArgumentException("Argument nie moze miec wartosci NULL");
        } else {
            return true;
        }
    }
}
