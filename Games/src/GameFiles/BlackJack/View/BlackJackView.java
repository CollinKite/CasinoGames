package GameFiles.BlackJack.View;
import java.util.Scanner;

import Model.Player;

public class BlackJackView {


    public void blackjackMenu(Player player) {
        System.out.println("♣♠ Welcome to the Casino Blackjack! ♥♦");
        System.out.println("You have $" + player.getCredits() + " credits");
        System.out.println("Each game costs $50");
        System.out.println("Please select an option:");
        System.out.println("1. Play Blackjack");
        System.out.println("2. Instructions");
        System.out.println("3. Exit");
    }

    public void displayInstructions(){
        System.out.println("Blackjack is a card game where the goal is to get a hand value as close to 21 as possible without going over.");
        System.out.println("Each card is worth its face value, except for face cards which are worth 10, and aces which are worth 1 or 11.");
        System.out.println("You start with two cards, and can choose to hit or stand.");
        System.out.println("If you hit, you get another card. If you stand, you keep your current hand.");
        System.out.println("If you go over 21, you lose.");
        System.out.println("If you get 21, you win.");
        System.out.println("If you get a hand value higher than the dealer's, you win.");
        System.out.println("If you get a hand value lower than the dealer's, you lose.");
        System.out.println("If you get a hand value equal to the dealer's, you tie.");
    }

    public void print(String message){
        System.out.println(message);
    }




}
