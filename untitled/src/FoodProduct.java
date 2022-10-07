/**
 * The type Food product.
 */
public abstract class FoodProduct extends ConsumerProduct implements IDeadline {
    private static final double VAT = 0.055;
    private final IDeadline deadline;

    /**
     * Instantiates a new Food product.
     *
     * @param name  the name
     * @param price the price
     * @param days  the days
     */
    public FoodProduct(String name, double price, int days) {
        super(name, price);
        deadline = new Deadline(days);
    }

    public double getVAT() {
        return VAT;
    }

    public boolean expired() {
        return deadline.expired();
    }
}


