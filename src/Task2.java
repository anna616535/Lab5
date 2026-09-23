import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birth month?");
        int birthMonth;

        if(scan.hasNextInt()) {
            birthMonth = scan.nextInt();
            //come back if time to fix -'s being accepted
            //resolved
            if (birthMonth>=1&&birthMonth<=12) {
                System.out.println("Your birth month is " + birthMonth);
            } else {
                System.out.println(birthMonth + " is not a valid input. put between 1 and 12");
                System.exit(0);
            }
        }
        else{
            System.out.println("Error, enter int between 1-12");
            System.exit(0);
        }
    }
}
