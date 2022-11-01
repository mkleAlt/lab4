package ak.po.Enums;

public enum Currency {
    PLN("polski zloty"),
    USD("dolar amerykanski");

    private String name;

    Currency(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
