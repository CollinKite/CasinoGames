package Slots.View;

import Model.Player;

public class SlotsView {
    public void slotsMenu(Player player) {
        System.out.println("♣♠ Welcome to the Casino Slots! ♥♦");
        System.out.println("You have $" + player.getCredits() + " credits");
        System.out.println("Each spin costs $50");
        System.out.println("Please select an option:");
        System.out.println("1. Play Slots");
        System.out.println("2. Exit");
    }

    public void spin(int[] spin, int[] spin2, int[] spin3) {
        System.out.println("You spun: ");
        System.out.println(spin2[0] + " " + spin2[1] + " " + spin2[2]);
        System.out.println(spin[0] + " " + spin[1] + " " + spin[2]);
        System.out.println(spin3[0] + " " + spin3[1] + " " + spin3[2]);
    }
}
