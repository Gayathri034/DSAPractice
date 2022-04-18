package com.gayi;
import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name="Gayi";
        System.out.println(Arrays.toString(name.toCharArray()));
System.out.println(name.toLowerCase(Locale.ROOT));
System.out.println(Arrays.toString(name.split("")));
    }
}
