package GameFiles.BlackJack.Controller;


import Model.Player;
import GameFiles.BlackJack.View.BlackJackView;
import GameFiles.BlackJack.Model.BlackJackModel;
import View.View;

public class BlackJackController {

    public static View view = new View();
    public static BlackJackView blackjackView = new BlackJackView();
    public boolean exitGame = false;

    public void startBlackjack(Player player) {

        do {
            blackjackView.blackjackMenu(player);
            //menu selection 1-3
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
                        playBlackJack(player);
                    }
                }
                case 2 -> blackjackView.displayInstructions();
                case 3 -> exitGame = true;
            }

        } while (!exitGame);


    }
        public void playBlackJack(Player player)
        {
            int hand = BlackJackModel.drawCard() + BlackJackModel.drawCard();
            int DealerHand = BlackJackModel.drawCard() + BlackJackModel.drawCard();

            blackjackView.print("Your hand is " + hand);
            blackjackView.print("The dealer's hand is " + DealerHand);
            while (hand < 21 && DealerHand < 21)
            {
                blackjackView.print("Would you like to hit or stay?");
                String choice = view.readString();
                if (DealerHand < 17)
                {
                    DealerHand = DealerHand + BlackJackModel.drawCard();
                    blackjackView.print("The dealer hits! Dealer's hand is: " + DealerHand);
                }else if(DealerHand > 17)
                {

                    blackjackView.print("The dealer stands! Dealer's hand is:  " + DealerHand);
                }
                if (choice.equals("hit"))
                {
                    hand = hand + BlackJackModel.drawCard();
                    blackjackView.print("Your hand is " + hand);
                }
                if (choice.equals("stay"))
                {
                    break;
                }
            }
            checkWin(player, hand, DealerHand);
        }

        public void checkWin(Player player, int hand, int DealerHand)
        {
            if (hand > DealerHand && hand <= 21)
            {
                blackjackView.print("You won!");
                player.setCredits(player.getCredits() + 100);
            }
            if (DealerHand > hand && DealerHand <= 21)
            {
                blackjackView.print("You lost!");
            }
            if (hand > 21)
            {
                blackjackView.print("You lost!");
            }
            if (DealerHand > 21)
            {
                blackjackView.print("You won!");
                player.setCredits(player.getCredits() + 100);
            }
        }

    }
