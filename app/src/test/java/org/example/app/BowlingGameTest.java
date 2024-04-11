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
    @DisplayName("Instantiate a new game object")
    public void canMakeGame(){
        new BowlingGame();
    }
}
