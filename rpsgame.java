import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class rpsgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String[] game = {"Rock", "Paper", "Scissors"};
            String computerMove = game[new Random().nextInt(game.length)];
            String playerMove;

            while (true) {
                System.out.println("Place your Move(Rock,Paper,Scissor)");
                playerMove = sc.nextLine();
                if (playerMove.equals("Rock") || playerMove.equals("Paper") || playerMove.equals("Scissors")) {
                    break;
                }
                System.out.println(playerMove + " is not a valid move");
            }
            System.out.println("Computer Player :" + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("This Game was Ties");
            } else if (playerMove.equals("Rock")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You Lose!");
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("You Win!");
                }
            } else if (playerMove.equals("Paper")) {
                if (computerMove.equals("Rock")) {
                    System.out.println("You win!");
                } else if (computerMove.equals("Scissors")) {
                    System.out.println("You Lose!");
                }
            } else if (playerMove.equals("Scissors")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You win!");
                } else if (computerMove.equals("Rock")) {
                    System.out.println("You Lose!");
                }
            }
            System.out.println("Play again?(Yes/No)");
            String playAgain = sc.nextLine();
            if (!playAgain.equals("Yes")) {
                break;
            }
        }
    }
}

