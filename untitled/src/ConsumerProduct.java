/**
 * The type Consumer product.
 */
public abstract class ConsumerProduct implements Product {

    private static final double VAT = 0.2;
    private final String name;
    private final double price;

    /**
     * Instantiates a new Consumer product.
     *
     * @param name  the name
     * @param price the price
     */
    public ConsumerProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Get vat double.
     *
     * @return the double
     */
    public double getVAT() {
        return VAT;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public double getVatPrice() {
        return (getVAT() + 1) * getPrice();
    }

    @Override
    public double getVatAmount() {
        return getVAT() * getPrice();
    }

    @Override
    public double getUnitPrice() {
        return getPrice();
    }

    @Override
    public double getUnitVatPrice() {
        return getUnitPrice() * (getVAT() + 1);
    }

    @Override
    public double getUnitVatAmount() {
        return getUnitPrice() * getVAT();
    }
}
