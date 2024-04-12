/*
 * This is a comment.
*/
package test.java.org.example.app;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.example.app.BowlingGame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class BowlingGameTest {
    private BowlingGame game;

    @BeforeEach
    public void setUp(){
        game = new BowlingGame();
    }

    @Test
    @DisplayName("Can roll pins")
    public void canRollPins(){
        game.roll(0);
    }

    @Test
    @DisplayName("Can score a gutter game")
    public void canScoreGutterGame(){
        roll(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    @DisplayName("Can score a game of ones")
    public void canScoreAgameOfOnes(){
        roll(20, 1);
        assertEquals(20, game.score());
    }
    
    private void roll(int times, int pinsHit){
        for (int i = 0; i<times; i++){
            game.roll(pinsHit);
        }
    }
}
