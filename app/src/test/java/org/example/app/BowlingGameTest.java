/*
 * This is a comment.
*/
package test.java.org.example.app;
import org.junit.jupiter.api.DisplayName;
import org.example.app.BowlingGame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class BowlingGameTest {
    @Test
    @DisplayName("Can roll pins")
    public void canRollPins(){
        BowlingGame game = new BowlingGame();
        game.roll(0);
    }
    @Test
    @DisplayName("Can score a gutter game")
    public void canScoreGutterGame(){
        BowlingGame game = new BowlingGame();
        assertEquals(0, game.score());
    }
    @Test
    @DisplayName("Can score a game of ones")
    public void canScoreAgameOfOnes(){
        BowlingGame game = new BowlingGame();
        for (int i = 0; i<20; i++){
            game.roll(1);
        }
        assertEquals(20, game.score());
    }
}
