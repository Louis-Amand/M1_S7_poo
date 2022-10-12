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


    public double getPrice() {
        return this.price;
    }
    
    public double getVatPrice() {
        return (getVAT() + 1) * getPrice();
    }


    public double getVatAmount() {
        return getVAT() * getPrice();
    }


    public abstract double getUnitPrice();

    public double getUnitVatPrice() {
        return getUnitPrice() * (getVAT() + 1);
    }

    public double getUnitVatAmount() {
        return getUnitPrice() * getVAT();
    }
}
