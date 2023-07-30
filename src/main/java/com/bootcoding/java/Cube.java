package com.bootcoding.java;

import java.util.Scanner;

public class Cube {
    public static void main(StringEx1[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number!");
        int n = scanner.nextInt();
        System.out.println("Cubes of numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            int cube = i * i * i;
            System.out.println(i + " cubed is " + cube);

        }
    }

}


