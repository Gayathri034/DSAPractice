package com.gayi;
import java.util.Scanner;
public class Repetition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 543515;
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 5) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
