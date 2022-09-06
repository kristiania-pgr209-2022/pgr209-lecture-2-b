package no.kristiania.yatzi;

public class YatziTest {

    @Test
    void shouldScoreChance() {
        YatziDice dice = new YatziDice(new int[] {
                2, 2, 3, 5, 6
        });
        assertEquals(2+2+3+5+6, dice.scoreAs(YatziCategory.CHANCE));
    }
}
