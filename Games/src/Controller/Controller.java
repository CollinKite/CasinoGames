package Controller;

import Model.Player;
import View.View;

import java.util.Scanner;

public class Controller {

    private static  View view = new View();
    Player player = new Player();



    public void start() {
        player.setName(view.askForName());
        view.menu(player);
        int input = view.readInt(1, 4);
        switch (input) {
            case 1:
                System.out.println("You selected Blackjack");
                break;
            case 2:
                System.out.println("You selected Craps");
                break;
            case 3:
                System.out.println("You selected Slots");
                break;
            case 4:
                System.out.println("You selected Exit");
                break;
        }

    }



}
