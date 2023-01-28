package com.practice;

import java.util.Scanner;

public class demo {

    static int[] setFibonacci(int t){
    int[] arr=new int[t];
     int a=0;
     int b=1;
     int c;
        for (int i=0;i<t;i++){
            if(i==0){
                arr[i]=a;
            }else if(i == 1){
                arr[i]=b;
            }else {
                c = a + b;
                arr[i] = c;

                a = b;
                b = c;
            }
        }

        return arr;
    }

    public static void main(String[] args){
        System.out.println("enter the no of terms you need");
        Scanner s=new Scanner(System.in);
        int term = s.nextInt();
        System.out.println("the term is "+term);

      int[] arr1;
        arr1 = setFibonacci(term);
        for (int i=0;i<term;i++){
            System.out.print(" "+arr1[i]);
        }

    }
}
