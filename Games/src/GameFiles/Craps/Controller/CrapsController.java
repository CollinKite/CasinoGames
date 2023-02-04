package GameFiles.Craps.Controller;

import GameFiles.Craps.Model.CrapsModel;
import GameFiles.Craps.View.CrapsView;
import Model.Player;
import View.View;


import java.util.Scanner;

public class CrapsController {
    public static View view = new View();
    private CrapsModel crapsModel = new CrapsModel();
    private CrapsView crapsView = new CrapsView();
    private boolean exitGame = false;

    Scanner in = new Scanner(System.in);

    public void startCraps(Player player) {
        do {
            crapsView.crapsMenu(player);
            switch (view.readInt(1, 3)) {
                case 1 -> {
                    if (player.getCredits() < 1)
                    {
                        view.print("You don't have enough credits to play");
                        exitGame = true;
                    }  if (player.getCredits() >= 1)
                    {
                        player.setCredits(player.getCredits() - 50);
                        exitGame = false;
                        playCraps(player);
                    }
                }
                case 2 -> crapsView.displayInstructions();
                case 3 -> exitGame = true;
            }
        } while (!exitGame);
    }

    public void playCraps(Player player) {
        boolean gameOver = false;
        int playerBet = bet(player);
        diceRoll();
        int sumToMatch = crapsModel.getSum();

        {
            while (!gameOver) {

                if (checkWin(crapsModel.getPoint(), player, playerBet, sumToMatch)) {
                    gameOver = true;
                } else {
                    diceRoll();
                }
            }
        }
    }

    public boolean checkWin(int point, Player player, int playerBet, int sumToMatch) {

        switch (point) {
            case -1 -> {
                view.print("You rolled a 7 or 11. You win!");
                player.setCredits(player.getCredits() + playerBet * 2);
                view.print("You added $" + playerBet + " to your credits. You have $" + player.getCredits() + " left.");
                crapsModel.setPoint(0);
                return true;
            }
            case -2 -> {
                view.print("You rolled a 2, 3, or 12. You lose!");
                view.print("You have $" + player.getCredits() + " left.");
                crapsModel.setPoint(0);
                return true;
            }
            case -3 -> {
                view.print("You rolled a 7. You lose!");
                view.print("You have $" + player.getCredits() + " left.");
                crapsModel.setPoint(0);
                return true;

            }
            case -4 -> {
                view.print("You rolled " + sumToMatch + ". You win!");
                player.setCredits(player.getCredits() + playerBet * 2);
                view.print("You added $" + playerBet + " to your credits. You have $" + player.getCredits() + " left.");
                crapsModel.setPoint(0);
                return true;
            }
            default -> {
                view.print("You must roll a " + sumToMatch + " before you roll a 7 to win.");

                return false;
            }
        }
    }

    public void diceRoll() {
        view.print("Press enter to roll the dice.");
        in.nextLine();
        crapsModel.rollDice();
        view.print("You rolled a " + crapsModel.getDie1() + " and a " + crapsModel.getDie2() + "!");
    }

    public int bet(Player player) {
        view.print("Please enter your bet");
        view.print("You have $" + player.getCredits() + " to bet.");
        int bet = view.readInt(1, player.getCredits());
        player.setCredits(player.getCredits() - bet);
        view.print("You bet $" + bet + "!");
        return bet;
    }
}


