/*
 * This is a comment.
*/
package org.example.app;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
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

    @Test //Good test for the base case
    @DisplayName("Can score a game of ones")
    public void canScoreAgameOfOnes(){
        roll(20, 1);
        assertEquals(20, game.score());
    }

    @Test //Good test case for a spare
    //Nice use of a display name, but you might make change the wording to describe the behavior
    //("it scores a spare as 10 plus the value of the next ball") instead of the specific test case
    //used ("it scores a spare followed by a 6")
    @DisplayName("Can score a game of spare followed by a 6")
    public void canScoreAgameOfSpare(){
        game.roll(4);
        game.roll(6);
        game.roll(6);
        roll(17, 0);
        assertEquals(22, game.score());
    }

    @Test //Good test case for a strike
    @DisplayName("Can score a game of strike followed by two four's")
    public void canScoreAgameOfStrike(){
        game.roll(10);
        game.roll(4);
        game.roll(4);
        roll(17, 0);
        assertEquals(26, game.score());
    }

    private void roll(int times, int pinsHit){
        for (int i = 0; i<times; i++){
            game.roll(pinsHit);
        }
    }
}
