// Some comment

package org.example.app;


public class BowlingGame {
    private int rowIndex = 0;
    private int[] rolls = new int[21];
    private int score = 0;

    // roll method to record rolls in the rolls array
    public void roll(int pinsHit){
        rolls[rowIndex] = pinsHit;
        rowIndex++;
    }

    // score method to calculate score
    public int score(){
        int score = 0;
        for (int i = 0; i < rolls.length; i++){
            score += rolls[i];
        }
        return score;
    }
}
