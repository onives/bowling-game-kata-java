// Some comment

package org.example.app;


public class BowlingGame {
    private int score = 0;
    // roll method
    public void roll(int pinsHit){
        score += pinsHit;
    }

    // score method to calculate score
    public int score(){
        return score;
    }
}
