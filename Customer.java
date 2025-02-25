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

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private void setDiscount() {
        CustomerTypeEnum customerType = CustomerTypeEnum.getAll().
        for (CustomerTypeEnum customType : CustomerTypeEnum.values()) {
            if (type == customType.getType()) {
                discount = customType.getDiscount();
            }
        }
    }
}