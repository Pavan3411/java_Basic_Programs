public class second_and_minutes {
    public static void main(String[] args){
        System.out.println(getDurationString(121, 10));
        System.out.println(getDurationString(3600));
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || seconds <0 || seconds > 59){
            return "Invalid value";
        }

        int hours = minutes/60;
        int remainingMinutes = minutes%60;

        return String.format("%02dh %02dm %02ds ", hours, remainingMinutes, seconds);
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        int minutes = seconds/ 60;
        int remainingSeconds = seconds%60;

        return getDurationString(minutes, remainingSeconds);
    }
}
