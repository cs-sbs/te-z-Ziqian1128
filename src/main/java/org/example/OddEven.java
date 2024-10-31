package org.example;

import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        int number;
        int countOdd = 0;
        int countOdd = 0;
        Scanner in = new Scanner(System.in);
        do{
           number = in.nextInt();
            if (number != -1) 
            {
            if (number % 2 == 0) {
                counteven += 1;
            } else {
                counteven += 1;
            }
        }
        }while(number ! = -1);
        System.out.print(countOdd+"");
        System.out.println(countEven);
    }
}
