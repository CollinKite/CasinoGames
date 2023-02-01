package Slots.Controller;

import Model.Player;
import Slots.Model.SlotsModel;
import Slots.View.SlotsView;
import View.View;

public class SlotsController {

    public static View view = new View();
    public static SlotsModel slotsModel = new SlotsModel();
    public static SlotsModel slotsModel2 = new SlotsModel();
    public static SlotsModel slotsModel3 = new SlotsModel();
    public static SlotsView slotsView = new SlotsView();
    public boolean play = false;

    public void startSlots(Player player) {

        do {
            slotsView.slotsMenu(player);
            switch (view.readInt(1, 2)) {
                case 1 -> {
                    if (player.getCredits() < 1)
                    {
                        slotsView.print("You don't have enough credits to play");
                        play = true;
                    }  if (player.getCredits() >= 1)
                    {
                        player.setCredits(player.getCredits() - 50);
                        play = false;
                        playSlots(player);
                    }
                }
                case 2 -> play = true;
            }
        } while (!play);

    }

    public void playSlots(Player player)
    {
        int[] spin = slotsModel.spin();
        int[] spin2 = slotsModel2.spin();
        int[] spin3 = slotsModel3.spin();
        slotsView.spin(spin, spin2, spin3);

        checkWin(player);
    }

    public void checkWin(Player player)
    {
        if (slotsModel.scoreSpin() > 0)
        {

            slotsView.print("You won $" + slotsModel.scoreSpin() + "!");
            player.setCredits(player.getCredits() + slotsModel.scoreSpin());
        } else
        {
            slotsView.print("You lost!");
        }

    }


}

