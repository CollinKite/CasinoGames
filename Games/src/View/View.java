package View;

import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);

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
