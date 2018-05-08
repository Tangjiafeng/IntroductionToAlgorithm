package com.ecnu.sort;

public class HeapSort {
    public void maxHeapify(int[] A, int i, int heapSize) {
        int l = left(i);
        int r = right(i);
        int largst;
        if(l < heapSize && A[l] > A[i]) {
            largst = l;
        } else {
            largst = i;
        }
        if(r < heapSize && A[r] > A[largst]) {
            largst = r;
        }
        if(largst != i) {
            int temp = A[i];
            A[i] = A[largst];
            A[largst] = temp;
            maxHeapify(A, largst, heapSize);
        }
    }

    public void buildMaxHeap(int[] A) {
        for(int i = (A.length - 1) / 2; i >= 0; i --) {
            maxHeapify(A, i, A.length - 1);
        }
    }

    public void heapSort(int[] A) {
        int headSize = A.length;
        buildMaxHeap(A);
        for(int i = headSize - 1; i >= 1; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            headSize --;
            maxHeapify(A, 0, headSize);
        }
    }

    public int left(int i) {
//        if(i == 0) {
//            return 1;
//        }
        return 2 * i + 1;
    }

    public int right(int i) {
//        if(i == 0) {
//            return 2;
//        }
        return 2 * i + 2;
    }
}
