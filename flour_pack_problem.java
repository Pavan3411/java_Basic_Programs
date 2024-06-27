public class flour_pack_problem {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));
    }
        public static boolean canPack(int bigCount, int smallCount, int goal){
            if( bigCount < 0 || smallCount < 0 || goal < 0){
                return false;
            }
            int bigkilos = 5 * bigCount;

            while (bigkilos > goal){
                bigkilos -=5;
            }
            return goal - bigkilos <= smallCount;
    }
}
