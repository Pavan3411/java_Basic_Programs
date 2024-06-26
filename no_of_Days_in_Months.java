public class no_of_Days_in_Months {
    public static void main(String[] args) {
        int month = 3;
        int year = 2015;

        int days = getDaysInMonth(month, year);
        String monthName = getMonthName(month);

        System.out.println(monthName + " " + year + " has " + days + " days");
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29 : 28;
            default:
                return 31;
        }
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }
}