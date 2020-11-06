package Final;

import java.util.Scanner;


public class BMIcalc {
    public static void main(final String[] args) {
        System.out.print("\n\nWelcome to BMI Calc");
        final Scanner sc = new Scanner(System.in);
        String Continue = "y";
        int BMI,weightInPounds = 0;
        int heightInInches = 0;
        
        // Program Loop
        while(Continue.equalsIgnoreCase("y")){

            System.out.print("\n\nPlease enter your weight in Pounds:  ");
            weightInPounds = sc.nextInt();
    
            System.out.print("\n\nPlease enter your height in Inches: ");
            heightInInches = sc.nextInt();

            // BMI Formula 
            BMI = weightInPounds * 703 / (heightInInches * heightInInches);

           // System.out.print(BMI);

           // Results 
            if(BMI < 18.5){
                System.out.print("Your BMI is " + BMI);

                System.out.print("\n\n You are Underweight");
            }

            else if(BMI >= 18.5 && BMI < 24.9){
                System.out.print("Your BMI is " + BMI);

                System.out.print("\n\n You are Normal");
            }

            else if(BMI >= 25 && BMI < 29.9){
                System.out.print("Your BMI is " + BMI);

                System.out.print("\n\n You are Overweight");
            }
            else if(BMI > 30){
                System.out.print("Your BMI is " + BMI);

                System.out.print("\n\n You are Obese");
            }
            // If BMI is not calculable
            else{
            System.out.print("\nUnable to determine BMI please re-enter weight and height");
            continue;
            }
            // Program Exit 
            System.out.print("\n\nWould you like to continue ? (y/n) ");
            Continue = sc.next();    

        }

        System.out.print("\n\nEnd of Program");
    }
    
}