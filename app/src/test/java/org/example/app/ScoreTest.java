/*
 * This is a comment.
 */

package org.example.app;
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

    // The tests below this line don't test anything new (at least not anymore; perhaps they once
    // did in an earlier form of the code).  They can be safely removed.
    @Test
    @DisplayName("Test score sum of 4 integers")
    public void testSumOfPinsInSecondFrame(){
        int numbers [] = {1, 7, 2, 6};
        assertEquals(16, Score.sumOfPinsInFrame(numbers));
    }
    @Test
    @DisplayName("Test score sum of 6 integers")
    public void testSumOfPinsInThirdFrame(){
        int numbers [] = {1, 7, 2, 6, 1, 0};
        assertEquals(17, Score.sumOfPinsInFrame(numbers));
    }
}
