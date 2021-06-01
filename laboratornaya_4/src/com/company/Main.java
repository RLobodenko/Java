//Вариант №1
package com.company;



public class  Main {

    public static void main(String[] args){
        int A[] = {1,2,3,4,5};
        int min = A[0];
        for(int x: A) {
            if(x < min) min = x;
        }
        System.out.println("Minimal element array(A): " + min);

        int B[] = {2,3,4,5,6};
        int min1 = B[0];
        for(int x: B) {
            if(x < min1) min1 = x;
        }
        System.out.println("Minimal element array(B): " + min1);
        int C[] = {3,4,5,6,7};
        int min2 = C[0];
        for(int x: C) {
            if(x < min2) min2 = x;
        }
        System.out.println("Minimal element array(C): " + min2);
    }
}

