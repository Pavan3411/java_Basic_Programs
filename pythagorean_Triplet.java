public class pythagorean_Triplet {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 4;
        if(py_triplet(a,b,c)){
            System.out.println(a + ", " +b +", " + c + " forms a pythagorean triplet");
        }
        else {
            System.out.println("Not Form");
        }

    }
    public static boolean py_triplet( int a, int b, int c){
        // arrange in ascending order
        if(a>c){
            int temp = a;
            a = c;
            c = temp;
        }
        if(b>c){
            int temp = b;
            b = c;
            c = temp;
        }

        return (a*a + b*b == c*c);
    }
}
