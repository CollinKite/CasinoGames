package GameFiles.Craps.View;

public class CrapsView {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayRollResult(int point) {
        if (point == -2) {
            System.out.println("You lose.");
        } else if (point == -1) {
            System.out.println("You win!");
        } else {
            System.out.println("Point is " + point + ".");
        }
    }

    public void displayInstructions() {
        System.out.println("Craps is a dice game where the goal is to roll either a 7 or the point value before rolling a 7.");
        System.out.println("On the first roll, if you roll a 7 or an 11, you win. If you roll a 2, 3, or 12, you lose.");
        System.out.println("Otherwise, the sum of the dice becomes the point value. To win, you must roll the point value before rolling a 7.");
    }
}

