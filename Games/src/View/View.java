package View;

import Model.Player;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public void menu(Player player) {
        System.out.println("♣♠ Welcome to the Casino " + player.getName() +"! ♥♦");
        System.out.println("Current Balance: $" + player.getCredits());
        System.out.println("Please select a game to play:");
        System.out.println("1. Play Blackjack");
        System.out.println("2. Play Craps");
        System.out.println("3. Play GameFiles.Slots");
        System.out.println("4. Exit");
    }

    public int readInt(int min, int max) {
        int input = 0;
        boolean valid = false;
        while (!valid) {
            try {
                input = Integer.parseInt(scanner.next());
                if (input >= min && input <= max) {
                    valid = true;
                } else {
                    System.out.println("Please enter a number between " + min + " and " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number between " + min + " and " + max);
            }
        }
        return input;
    }

    public String askForName() {
        System.out.println("Please enter your name:");
        return scanner.next();
    }
}
