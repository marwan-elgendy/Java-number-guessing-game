import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("I have randomally chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");
        boolean hasWon = false;
        for (int i = 10; i > 0; i--){
            System.out.println("You have " + i + " guess(es) left. guess the number: ");
            int guess = scanner.nextInt();
            if(randomNumber < guess) {
                System.out.println("It's smaller than " + guess );
            }
            else if(randomNumber > guess){
                System.out.println("It's greater than " + guess );
            }
            else {
                hasWon = true;
                break;
            }
        }
        if(hasWon){
            System.out.println("Congratulations! you got it right.");
        }
        else {
            System.out.println("GAME OVER... YOU LOSE!!");
            System.out.println("The number was: " + randomNumber);
        }
    }
}
