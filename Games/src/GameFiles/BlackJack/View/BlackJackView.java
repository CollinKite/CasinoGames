package GameFiles.BlackJack.View;

import Model.Player;

public class BlackJackView {
    public void blackjackMenu(Player player) {
        System.out.println("♣♠ Welcome to the Casino Blackjack! ♥♦");
        System.out.println("You have $" + player.getCredits() + " credits");
        System.out.println("Each spin costs $50");
        System.out.println("Please select an option:");
        System.out.println("1. Play Blackjack");
        System.out.println("2. Exit");
    }

    public void print(String message){
        System.out.println(message);
    }


}
