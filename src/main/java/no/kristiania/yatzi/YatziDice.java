package no.kristiania.yatzi;

public class YatziDice {
    private final int[] dice;

    public YatziDice(int[] dice) {
        this.dice = dice;
    }

    public int scoreAs(YatziCategory category) {
        if (category == YatziCategory.ONES) {
            int result = 0;
            for (int die : dice) {
                if (die == 1) {
                    result += die;
                }
            }
            return result;
        }
        int result = 0;
        for (int die : dice) {
            result += die;
        }
        return result;
    }
}
