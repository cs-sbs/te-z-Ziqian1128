package org.example;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number;
        int countOdd = 0;
        int countEven = 0;
        Scanner in = new Scanner(System.in);

        while ((number = in.nextInt())!= -1) {
            if (number % 2 == 1) {
                countOdd++;
            } else {
                countEven++;
            }
        }

        System.out.println(countOdd + " " + countEven);
        in.close();
    }
}
