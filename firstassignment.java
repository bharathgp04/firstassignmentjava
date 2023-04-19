import java.util.Scanner;
public class VotingAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are old enough to vote in a national election.");
        } else {
            System.out.println("Sorry, you are not old enough to vote in a national election.");
        }
        scanner.close();
    }
}