import java.util.Scanner;

public class taskFour {
    static void main() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Age?");
        int age=0;
        if(scan.hasNextInt()){
            age= scan.nextInt();
            if(age>=21&&age<=110){
                //birthMonth>=1&&birthMonth<=12
                //age=scan.nextInt();
                System.out.println("Take your ticket");
            }
            else if(age>110){
                System.out.println("Your too old. Vampire. ;p");
            }
            else{
                System.exit(0);
            }
        }
        else{
            System.out.println("Error, enter valid Int");
            System.exit(0);
        }

    }
}
