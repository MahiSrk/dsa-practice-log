package com.dsa.basics;

import java.util.Scanner;

public class B14_SortingOfArray {

    static void sortArray(int[] array, int size) {
       
    	int temp;

        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        sortArray(array, size);

        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
