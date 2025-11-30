class Electronics extends Product {

    private int warrantyPeriod;

    public Electronics(String id, String name, double price, int warrantyPeriod) {
        super(id, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    double calculateDiscount() {
        if (getPrice() > 50000) {
            return getPrice() * 0.10;
        } else {
            return getPrice() * 0.05;
        }
    }
}
