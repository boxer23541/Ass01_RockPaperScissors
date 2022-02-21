import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String player1;
        String player2 = "P";
        String yesNo;
        boolean validMoveP1;
        boolean validMoveP2;
        boolean validYesNo;
        boolean playAgain = false;

        do {
            do {
                System.out.println("Player One choose Rock, Paper, or Scissors [RPS]");
                player1 = in.nextLine();
                player1 = player1.toUpperCase();

                if (player1.equals("R") || player1.equals("P") || player1.equals("S")) {
                    validMoveP1 = true;
                    do {
                        System.out.println("Player Two choose Rock, Paper, or Scissors [RPS]");
                        player2 = in.nextLine();
                        player2 = player2.toUpperCase();

                        if (player2.equals("R") || player2.equals("P") || player2.equals("S")) {
                            validMoveP2 = true;
                        } else {
                            validMoveP2 = false;
                            System.out.println("Please enter either R, P, or S");
                        }
                    } while (!validMoveP2);
                } else {
                    validMoveP1 = false;
                    System.out.println("Please enter either R, P, or S");
                }
            } while (!validMoveP1);

            if (player1.equals("R")) {
                if (player2.equals("R")) {
                    System.out.println("Rock vs Rock its a TIE!");
                } else if (player2.equals("P")) {
                    System.out.println("Paper covers Rock Player2 wins!");
                } else //player2 is SCISSORS
                {
                    System.out.println("Rock crushes Scissors Player1 wins!");
                }
            } else if (player1.equals("P")) {
                if (player2.equals("R")) {
                    System.out.println("Paper covers Rock Player1 wins!");
                } else if (player2.equals("P")) {
                    System.out.println("Paper vs Paper its a TIE!");
                } else //player2 is SCISSORS
                {
                    System.out.println("Scissors cuts Paper Player2 wins!");
                }
            } else //player1 is SCISSORS
            {
                if (player2.equals("R")) {
                    System.out.println("Rock crushes Scissors Player2 wins!");
                } else if (player2.equals("P")) {
                    System.out.println("Scissors cuts Paper Player1 wins!");
                } else //player2 is SCISSORS
                {
                    System.out.println("Scissors vs Scissors its a TIE!");
                }
            }

            do {
                System.out.println("Do you want to play again? [Y/N]");
                yesNo = in.nextLine();
                yesNo = yesNo.toUpperCase();

                if (yesNo.equals("Y")) {
                    validYesNo = true;
                    playAgain = true;
                    System.out.println("Rerunning Program...");
                } else if (yesNo.equals("N")) {
                    validYesNo = true;
                    playAgain = false;
                    System.out.println("Closing Program...");
                } else {
                    System.out.println("Please enter Y or N");
                    validYesNo = false;
                }
            }while(!validYesNo);
        }while(playAgain);
    }
}
