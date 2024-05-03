// This is a comment

package org.example.app;

import java.util.stream.IntStream;

public class Score {
    public static int sumOfPinsInFrame(int [] nums){
        int totalScore = IntStream.of(nums).sum();
        return totalScore;
    }
    public static void main(String[] args) {
        System.out.println("here!");
    }
}
