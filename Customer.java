public class Customer {
    private String name;
    private String type;
    private double discount;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
        setDiscount();
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