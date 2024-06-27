public class even_sum {
    public static void main(String[] args){
        System.out.println(sumEven(10,10));
    }
    public static boolean isEven(int number){
        if(number<=0){
            return false;
        }
        return number % 2 ==0;
    }
    public static int sumEven(int start, int end){
        if(start> end || start <=0 || end <=0){
            return -1;
        }
        int sum = 0;
        for(int i = start; i<=end; i++){
            if(isEven(i)){
                sum+= i;
            }
        }
        return sum;
    }
}
