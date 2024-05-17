import java.util.Random;
import java.util.Scanner;

public class RocPaperSes {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            while (true) {
                String[] rps = {"r", "p", "s"};
                String computerMove = rps[new Random().nextInt(rps.length)];
                String playerMove;

                while (true) {
                    System.out.println("Please Enter Your Move (r, p, or s)");
                    playerMove = scan.nextLine();

                    if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                        break;
                    }
                    System.out.println(playerMove + " Is Not A Valid Move..!");
                }

                System.out.println("Computer played: " + computerMove);

                if (playerMove.equals(computerMove)) {
                    System.out.println("The Game was a Tie...!");
                } else if ((playerMove.equals("r") && computerMove.equals("s")) ||
                        (playerMove.equals("p") && computerMove.equals("r")) ||
                        (playerMove.equals("s") && computerMove.equals("p"))) {
                    System.out.println("You win!");
                } else {
                    System.out.println("You Lose...!");
                }

                System.out.println("Play Again? (y/n)");
                String playAgain = scan.nextLine();
                if (!playAgain.equals("y")) {
                    break;
                }
            }
        }
    }
