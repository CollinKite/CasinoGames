package Slots.Model;

public class SlotsModel {
    final int[] reel = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
    int spin1, spin2, spin3;

    private int spinReel() {
        int spin = (int) (Math.random() * 9);
        return reel[spin];
    }

    public int[] spin() {
        spin1 = spinReel();
        spin2 = spinReel();
        spin3 = spinReel();
        return new int[]{spin1, spin2, spin3};
    }

    public int scoreSpin() {
        if (spin1 == spin2 && spin2 == spin3) {
            return 100;
        } else if (spin1 == spin2 || spin2 == spin3 || spin1 == spin3) {
            return 50;
        } else {
            return 0;
        }
    }
}
