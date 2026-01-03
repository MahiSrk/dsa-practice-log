package com.dsa.basics;

import java.util.Scanner;

public class B13_MaxElementInArray {

    static int maxElement(int[] a, int n) {
        int max = a[0];

        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Maximum element is: " + maxElement(a, size));

    }
}
