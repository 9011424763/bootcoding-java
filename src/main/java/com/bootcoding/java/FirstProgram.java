package com.bootcoding.java;

import java.util.Scanner;

public class FirstProgram {
    public static void main(StringEx1[] args) {
        System.out.println();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Number!");
        int n=scanner.nextInt();
        int OriginalNumber = n;
        int ReverseNumber = 0;

        while (n!=0) {

            int digit = n % 10;

            ReverseNumber = (ReverseNumber * 10) + digit;

            n/=10;

        }
        if
        (OriginalNumber == ReverseNumber)

        {

            System.out.println( OriginalNumber + " is Palinedrome Number ");

        }else

        {

            System.out.println( OriginalNumber + " This is not palinedrome Number ");

        }

    }

}
