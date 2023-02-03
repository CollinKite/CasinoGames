package GameFiles.Craps.Controller;

import GameFiles.Craps.Model.CrapsModel;
import GameFiles.Craps.View.CrapsView;


import java.util.Scanner;

public class CrapsController {
    private CrapsModel crapsModel = new CrapsModel();
    private CrapsView crapsView = new CrapsView();

//    public void play() {
//        crapsView.displayInstructions();
//        Scanner in = new Scanner(System.in);
//        crapsView.displayMessage("\nWelcome to Craps!\n");
//
//        crapsView.displayMessage("Press enter to roll the dice.");
//        in.nextLine();
//
//        crapsModel.rollDice();
//        int point = crapsModel.getPoint();
//        crapsView.displayRollResult(point);
//        while (point > 0) {
//            crapsView.displayMessage("Press enter to roll again.");
//            in.nextLine();
//            crapsModel.rollDice();
//            point = crapsModel.getPoint();
//            crapsView.displayRollResult(point);
//        }
//    }
}


