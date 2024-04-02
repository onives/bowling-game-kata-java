// This is a comment

package org.example.app;

import org.example.list.LinkedList;

import static org.example.utilities.StringUtils.join;
import static org.example.utilities.StringUtils.split;
import static org.example.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class Score {
    public static int sumOfPinsInFrame(int [] nums){
        if (nums.length == 2){
            return nums[0] + nums[1];
        }
        return nums[0] + nums[1] + nums[2] + nums[3];
        
    }
    public static void main(String[] args) {
        System.out.println("here!");
    }
}
