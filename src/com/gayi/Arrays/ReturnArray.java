package com.gayi.Arrays;
import java.util.ArrayList;
public class ReturnArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 5, 6};
        int target = 4;
        ArrayList<Integer> ans = (ArrayList<Integer>) FindAllIndex(arr, target, 0, new ArrayList<>());
        System.out.println(ans);
    }

    static Object FindAllIndex(int[] arr, int target, int index, ArrayList<Integer> List) {
        if (index == arr.length) {
            return List;
        }
        if (arr[index] == target) {
            List.add(index);
        } else {
            return FindAllIndex(arr, target, index + 1, List);
        }

        return null;
    }
}

