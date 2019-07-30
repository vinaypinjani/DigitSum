package com.vinaypinjani;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(68));
        System.out.println(sumDigits(3));
        System.out.println(sumDigits(666));
        System.out.println(sumDigits(11));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        int lsf = number % 10;
        if (number >= 10) {
            while (number >= 10) {
                sum += lsf;
                number = number / 10;
                lsf = number % 10;
            }
            sum += lsf;
            return sum;
        }
        return -1;

    }


}
