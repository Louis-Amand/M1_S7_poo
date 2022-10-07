public class FoodProductSoldByVolume extends FoodProduct{
    private double volume;
    public FoodProductSoldByVolume(String name, double price, double volume, int days) {
        super(name, price, days);
        this.volume = volume;
    }
}
