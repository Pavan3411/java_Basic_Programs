import java.util.Scanner;

public class print_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number for which you want to print the table");
        int n = sc.nextInt();
        printTheTable(n);
    }
    public static void printTheTable(int n){
        int table;
        for( int i=1; i<=10; i++){
            table = n * i;
            System.out.println(n + " * " + i + " = " + table);
        }
    }
}
