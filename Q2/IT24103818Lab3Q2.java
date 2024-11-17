import java.util.Scanner;

public class IT24103818Lab3Q2 {
    public static void main ( String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly salary: " );
        double salary = scanner.nextDouble(); 

        System.out.print("Enter the number of OT hours: ");
        double hours = scanner.nextDouble();

        System.out.print("Enter the OT hourly rate: ");
        double rate = scanner.nextDouble();

        double total = salary + (hours * rate);

        System.out.println("The total salary including OT is: " + total);

    }
}

    

