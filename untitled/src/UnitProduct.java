/**
 * The type Unit product.
 */
public class UnitProduct extends ConsumerProduct {

    private int quantity;

    /**
     * Instantiates a new Unit product.
     *
     * @param name     the name
     * @param price    the price
     * @param quantity the quantity
     */
    public UnitProduct(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }

    @Override
    public double getUnitPrice() {
        return super.getPrice()/this.quantity;
    }
}
