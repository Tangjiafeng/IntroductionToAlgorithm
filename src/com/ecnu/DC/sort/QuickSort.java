package com.ecnu.DC.sort;

import com.ecnu.DC.sort.test.QuickSortTest;

public class QuickSort {
    public void qSort(int[] A, int l, int r) {

        if(l < r) {
            int x = A[r];
            int i = l - 1;
            int temp, p;

            for(int j = l; j <= r - 1; j ++) {
                if(A[j] <= x) {
                    i += 1;
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
            temp = A[r];
            A[r] = A[i + 1];
            A[i + 1] = temp;
            p = i + 1;
            QuickSortTest.print(A);
            qSort(A, l, p - 1);
            qSort(A, p + 1, r);
        }


    }
}
