package com.gayi;
import java.util.Scanner;
public class IsAmstrong {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        boolean ans = IsAmstrong(num);
        System.out.println(ans);
    }
    static boolean IsAmstrong( int num){
        int orginal=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            num=num/10;
            sum=sum+rem*rem*rem;
        }
        if(sum==orginal)
        {
            return true;

        }
        else{
            return false;
        }
    }
}
