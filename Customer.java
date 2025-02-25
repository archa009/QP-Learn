public class Customer {
    private String name;
    private String type;
    private double discount;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
        setDiscount();
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getType() {
        return type;
    }

    public double getDiscount() {
        return discount;
    }

    private void setDiscount() {
        CustomerTypeEnum customerType = CustomerTypeEnum.getAll();
        for (CustomerTypeEnum customType : CustomerTypeEnum.values()) {
            if (type == customType.getType()) {
                discount = customType.getDiscount();
            }
        }
    }
}