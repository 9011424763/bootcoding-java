package com.bootcoding.java;

public class Triangle {

    public static void main(String[] args) {


                int rows = 4;
                int num = 1;

                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows - i; j++) {
                        System.out.print("  "); // Adding spaces to align the numbers
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(num + " ");
                        num++;
                    }
                    System.out.println();
                }
            }
        }



