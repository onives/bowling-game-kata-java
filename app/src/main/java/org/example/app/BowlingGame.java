// Some comment

package org.example.app;


public class BowlingGame {
    private int rollIndex = 0;
    private int[] rolls = new int[21];
    private int score = 0;

    // roll method to record rolls in the rolls array
    public void roll(int pinsHit){
        rolls[rollIndex] = pinsHit;
        rollIndex++;
    }

    // score method to calculate score
    public int score(){
        int score = 0;
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++){
            
            if (isSpare(frameIndex)){// check if spare
                score += 10 + rolls[frameIndex+2]; // sum of the total in fram (10) plus the score of the next roll
                frameIndex += 2;
            }else{
                score += rolls[frameIndex] + rolls[frameIndex + 1];
                frameIndex += 2;
            }
            
        }
        return score;
    }

    private boolean isSpare(int frameIndex){
        return rolls[frameIndex] + rolls[frameIndex + 1]== 10;
    }
}
