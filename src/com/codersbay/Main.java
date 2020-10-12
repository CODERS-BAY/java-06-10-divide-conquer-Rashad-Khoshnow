package com.codersbay;

public class Main {

    public static void main(String[] args) {


        int[] arr = {1, 5, 11, 6, 7, 12};
        int max = findMaximum(arr);
        System.out.println(max);
    }

    public static int findMaximum(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int midpoint = arr.length / 2;
        int[] left = new int[midpoint];
        int[] right;

        if (arr.length % 2 == 0) {

            right = new int[midpoint];

        } else {

            right = new int[midpoint + 1];

        }
        for (int i = 0; i < midpoint; i++) {

            left[i] = arr[i];

        }

        for (int j = 0; j < right.length; j++) {

            right[j] = arr[midpoint + j];

        }
        int rightmaximum = findMaximum(right);
        int leftmaximum = findMaximum(left);

        if (leftmaximum > rightmaximum) {
            return leftmaximum;
        } else {
            return rightmaximum;
        }

    }

}