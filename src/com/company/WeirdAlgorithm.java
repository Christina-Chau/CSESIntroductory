package com.company;

import java.util.Scanner;

public class WeirdAlgorithm {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        long n = stdin.nextInt();
        divNum(n);
        stdin.close();
    }

    public static void divNum(long n){
        System.out.print(n + " ");
        if(n % 2 == 0 && n !=1)
            divNum(n / 2);
        if(n % 2 == 1 && n !=1)
            divNum((n * 3)+1);
    }
}
