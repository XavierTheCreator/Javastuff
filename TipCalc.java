package Jprog;

import java.util.Scanner;
import java.text.NumberFormat;
import java.math.*;

public class TipCalc {
    public static void main(String[] args) {
        System.out.print("Tip Calculator");
        Scanner sc = new Scanner(System.in);
        String input = "y";
        BigDecimal fifthteen,twenty,twentyfive,operator;

        fifthteen = new BigDecimal("0.15");
        twenty = new BigDecimal("0.20");
        twentyfive = new BigDecimal("0.25");

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        while(input.equalsIgnoreCase("y"))
        {
            System.out.print("\n\nCost of meal: ");
            BigDecimal mealCost = sc.nextBigDecimal();
    
            //15%
            System.out.print("\n\n15%\nTip Amount: ");
            BigDecimal tip15  = fifthteen.multiply(mealCost);
            System.out.print(currency.format(tip15));
            BigDecimal total15 = mealCost.add(tip15);

            System.out.print("\nTotal Amount: " + currency.format(total15));
    
            //20%
            System.out.print("\n\n20%\nTip Amount: ");
            BigDecimal tip20  = twenty.multiply(mealCost);
            System.out.print(currency.format(tip20));
            BigDecimal total20 = mealCost.add(tip20);

            System.out.print("\nTotal Amount: " + currency.format(total20));
    
            //25%
            System.out.print("\n\n25%\nTip Amount: ");
            BigDecimal tip25  = twentyfive.multiply(mealCost);
            System.out.print(currency.format(tip25));
            BigDecimal total25 = mealCost.add(tip25);

            System.out.print("\nTotal Amount: " + currency.format(total25));
    
            System.out.print("\nContinue (y/n)\t");
            input = sc.next();

        }
       System.out.print("End of Program");

    }
    
}