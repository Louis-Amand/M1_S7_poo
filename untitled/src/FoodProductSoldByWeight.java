/**
 * The type Food product sold by weight.
 */
public class FoodProductSoldByWeight extends FoodProduct {
    private final double weight;

    /**
     * Instantiates a new Food product sold by weight.
     *
     * @param name   the name
     * @param price  the price
     * @param weight the weight
     * @param days   the days
     */
    public FoodProductSoldByWeight(String name, double price, double weight, int days) {
        super(name, price, days);
        this.weight = weight;
    }

    public double getUnitPrice() {
        return super.getPrice() / this.weight;
    }
}
