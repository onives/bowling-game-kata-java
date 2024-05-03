// Some comment

package org.example.app;


// Overall it looks like you are pretty close to having a working algorithm.  I left some comments
// next to the code where I noticed something.  You have also demonstrated that you can do
// test-driven development in Java, and this will help you continue learning.
public class BowlingGame {
    private int rollIndex = 0;
    private int[] rolls = new int[21];
    private int score = 0; //Unused; can be safely deleted

    // roll method to record rolls in the rolls array
    public void roll(int pinsHit){
        rolls[rollIndex] = pinsHit;
        rollIndex++;
    }

    // score method to calculate score
    public int score(){
        int score = 0;
        int frameIndex = 0; //This might be better named "rollIndex" or "r", since it is used to index the array of roles
        for (int frame = 0; frame < 10; frame++){
            if (isStrike(frameIndex)){ //check strike
                //What if the very last roll of the game is a strike (e.g. the third ball in the 10th frame)?
                score += 10 + rolls[frameIndex+1] + rolls[frameIndex+2];
                frameIndex++;

            }else if (isSpare(frameIndex)){// check if spare
                //What if the the very last roll of the game is a spare (e.g. the second ball in the 10th frame)?
                //Shouldn't this be looking at the next ball (`rolls[frameIndex + 1]`) instead of 2 balls from now?
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
    private boolean isStrike(int frameIndex){
        return rolls[frameIndex] == 10;
    }
}
