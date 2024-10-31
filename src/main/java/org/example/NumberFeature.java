package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        int digitIndex = 1;  
        while (inputNumber > 0) {  
            int digit = inputNumber % 10;
            if ((digit % 2 == 0 && digitIndex % 2 == 0) || (digit % 2!= 0 && digitIndex % 2!= 0)) {  
                result = result * 2 + 1;  
            } else {
                result *= 2;  
            }
            inputNumber /= 10;
            digitIndex++;  
        }

        System.out.println(result);
    }
}
