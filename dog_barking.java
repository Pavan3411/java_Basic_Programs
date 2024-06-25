public class dog_barking {
    public static void main(String[] args){
        int hourOfDay = 1;
        boolean barking = true;
        boolean wake = shouldWakeUp(barking,hourOfDay);
        System.out.println(wake);

    }
    public static boolean shouldWakeUp( boolean barking,int hourOfDay ){
        if((hourOfDay<0 || hourOfDay>23) && barking){
            return false;
        }
        else if((hourOfDay<8 || hourOfDay>22) && barking ){
            return true;
        }

        else {
            return false;
        }
    }
}
