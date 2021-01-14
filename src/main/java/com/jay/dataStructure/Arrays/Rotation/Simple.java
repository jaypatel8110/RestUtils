package com.jay.dataStructure.Arrays.Rotation;

public class Simple {

    static void leftRotate(int arr[], int d, int n) {
        for (int i = 0; i < d; i++)
            rotate(arr, n);
    }

    static void rotate(int[] orig, int n) {
        int i, temp;
        temp = orig[0];

        for (i = 0; i < n - 1; i++) {
            orig[i] = orig[i+1];
        }
        orig[i]=temp;
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(arr, 2, 7);
        printArray(arr);
    }

}
