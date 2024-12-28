package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();

        int binary = 0;
        int multiplier = 1;
        while (inputNumber > 0) {
            int digit = inputNumber % 10;
            int parity = digit % 2;
            binary += parity * multiplier;
            multiplier *= 2;
            inputNumber /= 10;
        }

        // 将二进制转换为十进制
        int decimal = 0;
        multiplier = 1;
        while (binary > 0) {
            int bit = binary % 10;
            decimal += bit * multiplier;
            multiplier *= 2;
            binary /= 10;
        }

        result = decimal;

        System.out.println(result);
        in.close();
    }
}
