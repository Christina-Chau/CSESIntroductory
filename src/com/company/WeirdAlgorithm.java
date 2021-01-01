package com.company;

import java.util.Scanner;

/**
 * @author Christina Chau
 */
public class WeirdAlgorithm {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        long n = stdin.nextInt();
        divNum(n);
        stdin.close();
    }

    /**
     * Method to recursively change the input number based on its parity. Divides <code>n</code> by 2 if it is even or multiplies <code>n</code> by three and adds one if it is odd
     * @param n a number of type long
     */
    public static void divNum(long n){
        System.out.print(n + " ");
        if(n % 2 == 0 && n !=1)
            divNum(n / 2);
        if(n % 2 == 1 && n !=1)
            divNum((n * 3)+1);
    }
}
