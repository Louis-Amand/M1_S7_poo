public abstract class FoodProduct extends ConsumerProduct implements IDeadline{
    private static final double VAT = 5.50;
    private IDeadline deadline;

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


