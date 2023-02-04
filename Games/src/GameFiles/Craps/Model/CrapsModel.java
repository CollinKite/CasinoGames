package GameFiles.Craps.Model;

public class CrapsModel {
    private int point;
    private int die1;
    private int die2;
    private int sum;

    public void rollDice() {
        die1 = (int) (Math.random() * 6) + 1;
        die2 = (int) (Math.random() * 6) + 1;
        sum = die1 + die2;
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
                point = -3;
            } else if (sum == point) {
                point = -4;
            }
        }
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getDie1() {
        return die1;
    }

    public void setDie1(int die1) {
        this.die1 = die1;
    }

    public int getDie2() {
        return die2;
    }

    public void setDie2(int die2) {
        this.die2 = die2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

