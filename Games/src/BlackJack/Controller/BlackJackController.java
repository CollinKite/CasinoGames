package BlackJack.Controller;


import Model.Player;
import BlackJack.View.BlackJackView;
import BlackJack.Model.BlackJackModel;
import View.View;

public class BlackJackController {

    public static View view = new View();

    public static BlackJackModel blackJackModel = new BlackJackModel();
    public static BlackJackView blackjackView = new BlackJackView();
    public boolean play = false;

    public void startBlackjack(Player player) {

        do {
            blackjackView.blackjackMenu(player);
            switch (view.readInt(1, 2)) {
                case 1 -> {
                    if (player.getCredits() < 1) {
                        blackjackView.print("You don't have enough credits to play");
                        play = true;
                    }
                    if (player.getCredits() >= 1) {
                        player.setCredits(player.getCredits() - 50);
                        play = false;
                        playBlackJack(player);
                    }
                }
                case 2 -> play = true;
            }
        } while (!play);


    }
        public void playBlackJack(Player player)
        {
            blackjackView.print("You are playing blackjack!");
        }

    }
