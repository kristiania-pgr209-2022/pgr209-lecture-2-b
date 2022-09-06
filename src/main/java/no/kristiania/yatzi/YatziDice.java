package no.kristiania.yatzi;

import java.util.HashMap;
import java.util.Map;

public class YatziDice {
    private final int[] dice;

    public YatziDice(int[] dice) {
        this.dice = dice;
    }

    public int scoreAs(YatziCategory category) {
        Map<Integer, Integer> temp = new HashMap<>();
        for (int die : dice) {
            if (!temp.containsKey(die)) {
                temp.put(die, 0);
            }
            temp.put(die, temp.get(die) + 1);
        }

        if (category == YatziCategory.PAIR) {
            for (Integer dieValue : temp.keySet()) {
                if (temp.get(dieValue) >= 2) {
                    return dieValue * 2;
                }
            }
        }

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
