public class FoodProductSoldByWeight extends FoodProduct{
    private double weight;
    public FoodProductSoldByWeight(String name, double price, double weight, int days) {
        super(name, price, days);
        this.weight = weight;
    }
    @Override
    public double getUnitPrice() {
        return super.getUnitPrice();
    }
}
