/**
 * The type Food product sold by volume.
 */
public class FoodProductSoldByVolume extends FoodProduct {
    private final double volume;

    /**
     * Instantiates a new Food product sold by volume.
     *
     * @param name   the name
     * @param price  the price
     * @param volume the volume
     * @param days   the days
     */
    public FoodProductSoldByVolume(String name, double price, double volume, int days) {
        super(name, price, days);
        this.volume = volume;
    }

    public double getUnitPrice() {
        return super.getPrice() / this.volume;
    }
}
