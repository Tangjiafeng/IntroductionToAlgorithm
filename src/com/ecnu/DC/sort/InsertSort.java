package com.ecnu.DC.sort;

import com.ecnu.DC.sort.test.SortTest;

public class InsertSort {
    public void iSort(int[] A, int n) {
        for(int i = 1; i < n; i ++) {
            int temp = A[i];
            int j;
            for(j = i - 1; j >= 0; j --) {
                if(A[j] > temp) {
                    A[j + 1] = A[j];
                } else {
                    break;
                }
            }
            A[j + 1] = temp;
            System.out.print("第" + i +"轮排序:");
            SortTest.print(A);
        }
//        SortTest.print(A);
    }
}
