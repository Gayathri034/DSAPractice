package com.gayi.Arrays;
import java.util.ArrayList;
public class ReturnWithoutPassing {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 4, 5, 6};
        System.out.println(FindallIndex(arr, 4, 0));
    }

    static ArrayList<Integer> FindallIndex(int[] arr, int target, int index) {
        ArrayList<Integer> List = new ArrayList<>();
        if (index == arr.length) {
            return List;
        }
        if (arr[index] == target) {
            List.add(index);
        } else {
            ArrayList<Integer> ansFromBalls = FindallIndex(arr, target, index + 1);
            List.addAll(ansFromBalls);
            return List;

        }

        return List;
    }
}

