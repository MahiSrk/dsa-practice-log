package com.dsa.basics;

import java.util.Scanner;

public class B15_SumOfMatrices {

    static void sumOfTwoMatrices(int[][] matrixA, int[][] matrixB, int[][] result, int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix size:");
        int size = scanner.nextInt();

        int[][] matrixA = new int[size][size];
        int[][] matrixB = new int[size][size];
        int[][] resultMatrix = new int[size][size];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        sumOfTwoMatrices(matrixA, matrixB, resultMatrix, size);

        System.out.println("Sum of two matrices:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
