package com.gayi;
import java.util.Arrays;
public class EvenDigits {
    public static void main(String[] args) {
        int[]num={1,23,456,5678934};
int ans= digits(6785);
System.out.println(ans);
    }
    static int FindNumbers(int[]num){
        int count=0;
        for(int element:num){
            if(element==2){
                count++;
            }
        }
        return count;
    }


static boolean even(int num){
    int numberofdigits= digits(num);
    if (numberofdigits%2==0){
    return true;
    }
    return false;
}
static int digits(int num){
        int digits=0;
        if(digits<0){
            return digits*1;

        }
        if(digits==0){
            return 1;
        }
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;

        }
}
