package Controller;

import Model.Player;

import java.util.Scanner;

public class Controller {
    Player player = new Player();


    public void start() {


    }
    public void menu() {
        System.out.println("♣♠ Welcome to the Casino! ♥♦");
        System.out.println("Current Balance: $");
        System.out.println("Please select a game to play:");
        System.out.println("1. Play Blackjack");
        System.out.println("2. Play Craps");
        System.out.println("3. Play Slots");
        System.out.println("4. Exit");
    }


}
