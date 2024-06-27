public class sum_first_and_last_digit {
    public static void main(String[] args) {
        int check = sumFirstAndLastDigit(123452);
        System.out.println(check);
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        while(number > 9){
            number/= 10;
        }
        int firstDigit = number;
        return firstDigit + lastDigit;
    }
}
