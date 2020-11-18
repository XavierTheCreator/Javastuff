package Jprog;
import java.util.Scanner;
import java.util.Random;

public class rolltheDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "n";
        Greeting();

        choice = sc.nextLine();

        while(choice.equalsIgnoreCase("y")){
        
            int randomInt = (int) (Math.random() * 6+1);
            int randomInt2 = (int) (Math.random() * 6+1);

            int Die1 = randomInt;
            int Die2 = randomInt2;
            int total = Die1 + Die2;

            System.out.print("\n\nDie 1: " + Die1);
            System.out.print("\nDie 2: " + Die2);
            System.out.print("\nTotal: " + total);

            if(Die1 == 1 && Die2 == 1){
                System.out.print("\nSnakes eyes !");
            }
            else if (Die1 == 6 && Die2 == 6)
            {
                System.out.print("\nBoxcars!");
            }

        
            System.out.print("\n\nWould you like to roll again ? (y/n)");
            choice = sc.nextLine();
            continue;
        } 
        
        System.out.print("End of program");

    }

    private static void Greeting(){
        System.out.print("Welcome to the Dice Roller");
        System.out.print("\n\nRoll the dice ? (y/n)");
    } 

}