package com.ecnu.DC;

/**
 * max subarray problem
 * divide and conquer method
 * time cost: O(nlgn)
 */
public class MaxSubArrayProblem {
    private static final int INFINITY = -60000;

    public int[] findCrossingSubarray(int[] A, int low, int mid, int high) {
        int[] result = new int[3];
        int leftSum = INFINITY;
        int rightSum = INFINITY;
        int sum = 0;
        for (int i = mid; i >= low; i--) {
            sum += A[i];
            if(sum > leftSum) {
                leftSum = sum;
                result[0] = i;
            }
        }
        sum = 0;
        for (int j = mid + 1; j <= high; j ++) {
            sum += A[j];
            if(sum > rightSum) {
                rightSum = sum;
                result[1] = j;
            }
        }
        result[2] = leftSum + rightSum;
        return result;
    }

    public int[] findMaximumSubArray(int[] A, int low, int high) {
        int[] result = new int[3];
        int[] leftResult;
        int[] rightResult;
        int[] crossResult;
        result[0] = low;
        result[1] = high;
        result[2] = A[low];
        if(low == high) {
            return result;
        } else {
            int mid = (int) Math.floor((low + high) / 2.0);
            leftResult = findMaximumSubArray(A, low, mid);
            rightResult = findMaximumSubArray(A, mid + 1, high);
            crossResult = findCrossingSubarray(A, low, mid, high);

            if(leftResult[2] > rightResult[2] && leftResult[2] > crossResult[2]) {
                return leftResult;
            } else if(rightResult[2] > leftResult[2] && rightResult[2] > crossResult[2]) {
                return rightResult;
            } else {
                return crossResult;
            }
        }
    }
}
