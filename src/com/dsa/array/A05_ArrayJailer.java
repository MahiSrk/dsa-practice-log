package com.dsa.array;

import java.util.Scanner;

public class A05_ArrayJailer {

    public static void openDoors(int r, int n) {

        int arr[] = new int[n + 1];

        for(int round = 1; round <= n; round++) {

            for(int i = round; i <= n; i = i + round) {
                arr[i] = 1 - arr[i];
            }
            if(round == r) {

                System.out.println("Open doors at Round " + r + ":");

                for(int i = 1; i <= n; i++) {
                    if(arr[i] == 1) {
                        System.out.print(i + " ");
                    }
                }

                break;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total rounds:");
        int N = sc.nextInt();

        System.out.println("Enter round to check:");
        int R = sc.nextInt();

        openDoors(R, N);

        sc.close();
    }
}