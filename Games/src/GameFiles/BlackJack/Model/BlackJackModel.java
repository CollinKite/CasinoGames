package GameFiles.BlackJack.Model;

public class BlackJackModel {
    public static int drawCard() {
        return (int) (Math.random() * 13);
    }
}
