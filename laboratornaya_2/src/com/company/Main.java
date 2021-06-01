// вариант задания №5
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int x = input.nextInt();
        int a = 3;
        int b = 5;

        if (x == 2) {

            double y = a * Math.pow(Math.sin(x), 2) + Math.sqrt(x);

            System.out.println(y);
        }
        if (x == 1) {
            double y = b * Math.pow(Math.exp(x), Math.pow(x, 2));
            System.out.println(y);
        }
    }
}