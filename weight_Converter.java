public class weight_Converter {
    public static void main(String[] args){

    double weightKgs = 15.5;
    double grams = wg_Converter(weightKgs);
        System.out.println((int)grams + " grams");
    }
    public static double wg_Converter(double weightKgs){
        double grams = (weightKgs*1000);
        return grams;
    }
}

