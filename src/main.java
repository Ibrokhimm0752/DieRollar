import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        do {
            int rollCount = 0, die1, die2, die3;
            System.out.println("Roll\tDie 1\tDie 2\tDie 3\tSum");
            System.out.println("-------------------------------------");

            while (true) {
                rollCount++;
                die1 = random.nextInt(6) + 1;
                die2 = random.nextInt(6) + 1;
                die3 = random.nextInt(6) + 1;
                System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n", rollCount, die1, die2, die3, die1 + die2 + die3);
                if (die1 == die2 && die2 == die3) break;
            }

            System.out.print("Play again? Type 'yes' to continue or anything else to quit: ");
        } while (scanner.next().trim().equalsIgnoreCase("yes"));

        scanner.close();
        System.out.println("Thanks for playing! See you next time.");
    }
}
