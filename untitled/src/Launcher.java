/**
 * The type Launcher.
 */
public class Launcher {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        FoodProductSoldByVolume f1 = new FoodProductSoldByVolume("bananas",8.00,15,-15);
        System.out.println(f1.expired());

        FoodProductSoldByWeight f2 = new FoodProductSoldByWeight("rice", 3.55, 1,3);
        System.out.println(f2.getPrice());
        System.out.println(f2.getVAT());
        System.out.println(f2.getUnitVatPrice());
        System.out.println(f2.expired());
    }
}
