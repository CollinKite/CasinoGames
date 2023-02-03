package GameFiles.Craps.Model;

public class CrapsModel {
    private int point;

    public void rollDice() {
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        int sum = die1 + die2;
        if (point == 0) {
            if (sum == 7 || sum == 11) {
                point = -1;
            } else if (sum == 2 || sum == 3 || sum == 12) {
                point = -2;
            } else {
                point = sum;
            }
        } else {
            if (sum == 7) {
                point = -2;
            } else if (sum == point) {
                point = -1;
            }
        }
    }

    public int getPoint() {
        return point;
    }
}

