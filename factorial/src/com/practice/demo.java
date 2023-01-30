package com.practice;

import java.util.Scanner;

public class demo {

    static int factorial(int n){
        if(n==0||n==1){
            System.out.print(n+" =");
            return 1;
        }
        else {
            System.out.print(n+" * ");
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args){

        System.out.println("enter the number: ");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(factorial(num));
    }
}
