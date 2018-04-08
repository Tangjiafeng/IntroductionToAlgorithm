package com.ecnu.DC.sort.test;
import com.ecnu.DC.sort.QuickSort;

public class QuickSortTest {
    public static void main(String args[]) {
        int[] A = {8, 5, 3, 1, 9, 4, 84, 12, 41};
        QuickSortTest.print(A);
        new QuickSort().qSort(A, 0, 8);
    }

    public static void print(int[] A) {
        for(int i = 0; i < A.length; i ++) {
            System.out.print(A[i] + ",");
        }
        System.out.println("");
    }
}