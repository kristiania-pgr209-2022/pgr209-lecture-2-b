package no.kristiania.yatzi;

public class YatziDice {
    private final int[] dice;

    public YatziDice(int[] dice) {
        this.dice = dice;
    }

    public int scoreAs(YatziCategory category) {
        if (category == YatziCategory.ONES) {
            return scoreEqualDie(1);
        }
        if (category == YatziCategory.TWOS) {
            return scoreEqualDie(2);
        }
        int result = 0;
        for (int die : dice) {
            result += die;
        }
        return result;
    }

    private int scoreEqualDie(int targetDie) {
        int result = 0;
        for (int die : dice) {
            if (die == targetDie) {
                result += die;
            }
        }
        return result;
    }
}
