import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\nThe player wins only if:");
        System.out.println("- The player’s total is higher than the dice total, and");
        System.out.println("- The difference between the two totals is not more than 3");
        System.out.println("\nPlease enter three numbers (1 - 6):");

        System.out.println("First Number:");
        int firstNumber = scan.nextInt(); 
        System.out.println("Second Number:");
        int secondNumber = scan.nextInt(); 
        System.out.println("Third Number:");
        int thirdNumber = scan.nextInt(); 

        int userSum = firstNumber + secondNumber + thirdNumber; 

        if ( firstNumber > 6 || secondNumber > 6 || thirdNumber > 6 || firstNumber <= 0 || secondNumber <= 0 || thirdNumber <= 0 ) {
            System.out.println("Invalid. Please only enter 1-6.");
            System.exit(0);
        }

        System.out.println("Sum of your chosen numbers: " + userSum);

        int random1 =  (int)(Math.random() * 6 + 1);
        int random2 =  (int)(Math.random() * 6 + 1);
        int random3 =  (int)(Math.random() * 6 + 1);

        System.out.println("\nThe computer rolls three dice.");
        System.out.println("Computer dice 1: " + random1 );
        System.out.println("Computer dice 2: " + random2 );
        System.out.println("Computer dice 3: " + random3 );

        int sumComputerDice = random1 + random2 + random3;

        System.out.println("Sum of the computer's dice: " + sumComputerDice);

        if (userSum > sumComputerDice && (userSum - sumComputerDice) <= 3) {
            System.out.println("You win!"); 
        } else {
            System.out.println("Computer wins!"); 
        }
        
        scan.close();

    }

}
