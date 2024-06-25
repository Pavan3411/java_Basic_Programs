public class Hello {
    public static void main(String... args)
    {
    double budget = 1546.12;
    double petrolPrice = 84.11;
    double dieselPrice = 74.91;

    double petrolQuantity = budget/petrolPrice;
    double dieselQuantity = budget/dieselPrice;
        System.out.printf("With a budget of %.2f Rs, you can buy:\n", budget);
        System.out.printf("%.2f liters of petrol at %.2f Rs. per liters     \n", petrolQuantity,petrolPrice);
        System.out.printf("%.2f liters of diesel at %.2f Rs. per liters     \n", dieselQuantity,dieselPrice);
        System.out.printf("budget is :    " + budget);
        Double _height = 123.5;
        System.out.println(_height);
    }
}
