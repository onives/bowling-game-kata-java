/*
 * This is a comment.
 */

package test.java.org.example.app;
import org.example.app.Score;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ScoreTest {
    @Test
    @DisplayName("Test score sum of 2 integers")
    public void testSumOfPinsInFirstFrame(){
        int numbers [] = {1, 7};
        assertEquals(8, Score.sumOfPinsInFrame(numbers));
    }
    @Test
    @DisplayName("Test score sum of 4 integers")
    public void testSumOfPinsInSecondFrame(){
        int numbers [] = {1, 7, 2, 6};
        assertEquals(16, Score.sumOfPinsInFrame(numbers));
    }
}
