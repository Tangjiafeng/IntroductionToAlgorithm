package com.ecnu.DC.sort.test;
import com.ecnu.DC.sort.InsertSort;
import com.ecnu.DC.sort.QuickSort;

public class SortTest {
    public static void main(String args[]) {
        int[] A = {8, 5, 3, 1, 9, 4, 84, 12, 41, 9};
        SortTest.print(A);
        new QuickSort().qSort(A, 0, A.length - 1);
//        new InsertSort().iSort(A, A.length);
    }

    public static void print(int[] A) {
        for(int i = 0; i < A.length; i ++) {
            System.out.print(A[i] + ",");
        }
        System.out.println("");
    }
}