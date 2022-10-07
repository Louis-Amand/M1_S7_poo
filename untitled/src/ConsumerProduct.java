public abstract class ConsumerProduct implements Product{

    private static final double VAT = 20.0;
    private String name;
    private double price;

    public ConsumerProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getVAT(){
        return VAT;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getValPrice() {
        return 0;
    }

    @Override
    public double getVatAmount() {
        return VAT;
    }

    @Override
    public double getUnitPrice() {
        return 0;
    }

    @Override
    public double getUnitVatPrice() {
        return 0;
    }

    @Override
    public double getUnitVatAmount() {
        return 0;
    }
}
