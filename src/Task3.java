import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main() {
        Scanner scan= new Scanner(System.in);

        String party;
        System.out.println("Your party affiliation (Democrat(d), Republican(r), or Independent(i))");
        party=scan.nextLine();

        if(Objects.equals(party, "d")){
            System.out.println("You are an Democratic Donkey");
        }
        else if(Objects.equals(party, "r")) {
            System.out.println("You are an Republican Elephant");
        }
        else if(Objects.equals(party,"i")){
            System.out.println("You are an  Independent Person");
        }
        else{
            System.out.println(party+" is an invaild input please enter d, r, or i");
            System.exit(0);
        }

    }
}
