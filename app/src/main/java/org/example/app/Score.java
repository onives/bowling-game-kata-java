// This is a comment

package org.example.app;

import org.example.list.LinkedList;

import static org.example.utilities.StringUtils.join;
import static org.example.utilities.StringUtils.split;

import java.util.stream.IntStream;

import static org.example.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class Score {
    public static int sumOfPinsInFrame(int [] nums){
        int totalScore = IntStream.of(nums).sum();
        return totalScore;
    }
    public static void main(String[] args) {
        System.out.println("here!");
    }
}
