package Controller;

import Model.Player;
import GameFiles.Slots.Controller.SlotsController;
import View.View;
import GameFiles.BlackJack.Controller.BlackJackController;

import java.util.Scanner;

public class Controller {

    private static  View view = new View();
    Player player = new Player();
    SlotsController slotsController = new SlotsController();

    BlackJackController blackjackController = new BlackJackController();

    private boolean loop = true;


    //This should be made into a loop
    public void start() {
        player.setName(view.askForName());
        while (loop) {
            view.menu(player);
            int input = view.readInt(1, 4);
            switch (input) {
                case 1:
                    System.out.println("You selected Blackjack");
                    blackjackController.startBlackjack(player);
                    break;
                case 2:
                    System.out.println("You selected Craps");
                    break;
                case 3:
                    System.out.println("You selected GameFiles.Slots");
                    slotsController.startSlots(player);
                    break;
                case 4:
                    System.out.println("You selected Exit");
                    loop = false;
                    break;
            }
        }

    }



}
