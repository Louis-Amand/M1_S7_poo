public abstract class ConsumerProduct implements Product{
    private String name;
    private double price;

    public ConsumerProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
