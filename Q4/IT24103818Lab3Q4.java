import java.util.Scanner;

public class IT24103818Lab3Q4 {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 5 digit number: ");
        int number = input.nextInt() ;

        if (number <10000 || number > 99999){
        System.out.print("Number should be 5 digits only" );
        }

        else {
            String numberString = Integer.toString(number);
            for(int i = 0 ; i < numberString.length(); i++) {
                System.out.print(numberString.charAt(i));
                if (i < numberString.length() - 1){
                    System.out.print(" ");
                }

            }
        } 
    }
}