package View;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("♣♠ Welcome to the Casino! ♥♦");
        System.out.println("Current Balance: $");
        System.out.println("Please select a game to play:");
        System.out.println("1. Play Blackjack");
        System.out.println("2. Play Craps");
        System.out.println("3. Play Slots");
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
}
