import java.util.Scanner;

public class TaskOne {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        double priceOf;
        double tax=.02;
        double totalPriceOf=0;

        //output + input
        System.out.println("Enter price of purchase.");


        if(scan.hasNextDouble()) {
            priceOf=scan.nextDouble();
            if (priceOf < 0) {
                System.out.println("Error, enter number. not negitive");
                System.exit(0);
            } else if (priceOf >= 100) {
                totalPriceOf = priceOf;

            } else {
                totalPriceOf = priceOf * tax;
                priceOf = (double) (totalPriceOf += priceOf);
            }
        }else{
            System.out.println("Error, enter number. not word");
            System.exit(0);
        }


        System.out.println("Your total price is $"+totalPriceOf);
    }
}
