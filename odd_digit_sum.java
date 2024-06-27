public class odd_digit_sum {
    public static void main(String[] args) {
    int oddSum = getOddDigitSum(123456789);
        System.out.println(oddSum);
    }
    public static int getOddDigitSum(int number){
        if(number < 0 ){
            return -1;
        }
        int sum =0;
        while(number > 0){
            int digit = number % 10;
            if(digit % 2 !=0){
                sum += digit;
            }
            number/=10;
        }
        return sum;
    }
}
