public class palindrome_while {
    public static void main(String[] args) {
       if(isPalindrome(121)){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not Palindrome");
       }
    }
    public static boolean isPalindrome(int number){
        if(number < 0){
            return false;
        }
        int original = number;
        int reversed = 0;
        while(number!=0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }
}
