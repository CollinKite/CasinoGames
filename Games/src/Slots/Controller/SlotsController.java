package Slots.Controller;

import Model.Player;
import Slots.Model.SlotsModel;
import Slots.View.SlotsView;
import View.View;

public class SlotsController {

    public static View view = new View();
    public static SlotsModel slotsModel = new SlotsModel();
    public static SlotsView slotsView = new SlotsView();
    public boolean play = false;

    public void startSlots(Player player) {

        do {
            slotsView.slotsMenu();
            switch (view.readInt(1, 2)) {
                case 1 -> {
                    if (player.getCredits() < 1)
                    {
                        System.out.println("You don't have enough credits to play");
                        play = true;
                    }  if (player.getCredits() >= 1)
                    {
                        player.setCredits(player.getCredits() - 1);
                        play = false;
                        playSlots();
                    }
                }
                case 2 -> play = true;
            }
        } while (!play);

    }

    public void playSlots() {

        int[] spin = slotsModel.spin();
        System.out.println("You spun: " + spin[0] + " " + spin[1] + " " + spin[2]);
        //I don't know how we want to implement the player's credit yet based on how they win or lose
        System.out.println("You won: $" + slotsModel.scoreSpin());


    }


}

