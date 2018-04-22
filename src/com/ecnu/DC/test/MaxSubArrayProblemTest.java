package com.ecnu.DC.test;

import com.ecnu.DC.MaxSubArrayProblem;

import java.util.Arrays;

public class MaxSubArrayProblemTest {
    public static void main(String[] args) {
        int[] A = {13, -3, -25, 20, -3, -16, -23, 18, 20, -7, 12, -5, -22, 15, -4, 7};
        int[] result;

        MaxSubArrayProblem msp = new MaxSubArrayProblem();
        result = msp.findMaximumSubArray(A, 0, A.length - 1);
        System.out.println(Arrays.toString(result));
    }
}
