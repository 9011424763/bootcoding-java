package com.bootcoding.java;

import java.util.Scanner;

public class StringEx1 {
    public static void main(StringEx1[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any Positive Number!");


        int n = scanner.nextInt();


        for(int i = 1; i <= n;i++)
        {
            if(i % 2 == 0){

                System.out.println(i + " is Even Number!");

            }else

            {
                System.out.println(i + " is odd Number!");

            }
        }
    }

}

