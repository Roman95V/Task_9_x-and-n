package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result * x;
        }
        System.out.println("Значение " + x + " в степени " + n + " равно " + result);

        /*   int x = 10;
        int n = 2;
        System.out.printf("Значение " + x + " в степени " + n + " равно %.0f \n", Math.pow(x, n));*/
    }
}
