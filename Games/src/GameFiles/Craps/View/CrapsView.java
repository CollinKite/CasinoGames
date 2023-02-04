package GameFiles.Craps.View;

import Model.Player;

public class CrapsView {

    public void crapsMenu(Player player) {
        System.out.println("♣♠ Welcome to the Casino Craps! ♥♦");
        System.out.println("You have $" + player.getCredits() + " credits");
        System.out.println("Each game costs $50");
        System.out.println("Please select an option:");
        System.out.println("1. Play Craps");
        System.out.println("2. Instructions");
        System.out.println("3. Exit");
    }
    public void displayInstructions() {
        System.out.println("Craps is a dice game where the goal is to roll either a 7 or the point value before rolling a 7.");
        System.out.println("On the first roll, if you roll a 7 or an 11, you win. If you roll a 2, 3, or 12, you lose.");
        System.out.println("Otherwise, the sum of the dice becomes the point value. To win, you must roll the point value before rolling a 7.");
    }
}

