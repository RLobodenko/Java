// вариант задания №5
package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
                for (int n = 0; n <= 10; n++) {
                    int x = 1;
                    double a;
                    a = (Math.pow(2, n/2) * Math.sin((3.14*n)/4)*Math.pow(x, n)) / (1*2*3*4*5*6*7*8*9*10);
                    System.out.println(a);


        }
    }
}
