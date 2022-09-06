package no.kristiania.yatzi;

public class YatziDice {
    private final int[] dice;

    public YatziDice(int[] dice) {
        this.dice = dice;
    }

    public int scoreAs(YatziCategory category) {
        int result = 0;
        for (int die : dice) {
            result += die;
        }
        return result;
    }
}
