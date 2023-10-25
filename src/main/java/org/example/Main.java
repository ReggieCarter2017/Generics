package org.example;

public class Main {
    public static void main(String[] args) {
        CompareArrays<Integer> arr = new CompareArrays<Integer>();
        String[] arr1 = new String[] {"123", "123", "123"};
        String[] arr2 = new String[] {"123", "123", "123"};

        arr.compareArrays(arr1, arr2);


    }
}