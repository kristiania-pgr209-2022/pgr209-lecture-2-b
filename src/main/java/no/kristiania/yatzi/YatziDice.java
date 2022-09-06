package no.kristiania.yatzi;

import java.util.HashMap;
import java.util.Map;

public class YatziDice {
    private final int[] dice;

    public YatziDice(int[] dice) {
        this.dice = dice;
    }

    public int scoreAs(YatziCategory category) {
        Map<Integer, Integer> dieFrequency = new HashMap<>();
        for (int die : dice) {
            if (!dieFrequency.containsKey(die)) {
                dieFrequency.put(die, 0);
            }
            dieFrequency.put(die, dieFrequency.get(die) + 1);
        }

        if (category == YatziCategory.PAIR) {
            for (Integer dieValue : dieFrequency.keySet()) {
                if (dieFrequency.get(dieValue) >= 2) {
                    return dieValue * 2;
                }
            }
        }

        if (category == YatziCategory.ONES) {
            return dieFrequency.get(1);
        }
        if (category == YatziCategory.TWOS) {
            return dieFrequency.get(2) * 2;
        }
        int result = 0;
        for (int die : dice) {
            result += die;
        }
        return result;
    }

}
