package no.kristiania.yatzi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatziTest {

    @Test
    void shouldScoreChance() {
        var dice = new YatziDice(new int[] {
                2, 2, 3, 5, 6
        });
        assertEquals(2+2+3+5+6, dice.scoreAs(YatziCategory.CHANCE));
    }
    @Test
    void shouldScorePerfectChance() {
        var dice = new YatziDice(new int[] {
                6, 6, 6, 6, 6
        });
        assertEquals(5*6, dice.scoreAs(YatziCategory.CHANCE));
    }

    @Test
    void shouldScoreOnes() {
        var dice = new YatziDice(new int[] {
                1, 1, 2, 6, 4
        });
        assertEquals(2, dice.scoreAs(YatziCategory.ONES));
    }
}
