public class add_all_digits {
    public static void main(String[] args) {
        int n = 1234154;
        int x = n;
        int rem;
        int sum = 0;

        do{
            rem = n % 10;
            sum = sum + rem;
            n = n/10;
        } while(n!=0);
            System.out.println("The sum of digits of " + x + " is " + sum);

    }
}
