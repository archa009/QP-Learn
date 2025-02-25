public enum CustomerTypeEnum {

    REGULAR("Regular", 0.05),
    PREMIUM("Premium", 0.1),
    VIP("Vip", 0.2);

    private final String type;
    private final double discount;

    public java.lang.String getType() {
        return type;
    }

    public double getDiscount() {
        return discount;
    }

    CustomerTypeEnum(String type, double discount) {
        this.type = type;
        this.discount = discount;
    }

    public static List<CustomerTypeEnum> getAll() {
        return Arrays.asList(values());
    }
}
