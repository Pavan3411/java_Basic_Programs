public class decimal_comparator {
    public static void main(String[] args){
//        double c = 1.176233;
//        double a = 1.1762312;
//        double b = 1.17623222;
        System.out.println(comparator(2.23543,2.235432, 2.2354321));

    }
    public static boolean comparator(double a, double b, double c){
        double scaledA =  (a * 100000);
        double scaledB =  (b * 100000);
        double scaledC =  (c * 100000);
        if( scaledA == scaledB && scaledB==scaledC){
            return true;
        } else{
            return false;
        }
    }
}
