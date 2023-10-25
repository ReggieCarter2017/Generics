package org.example;

public class Main {
    public static void main(String[] args) {
        // First task
        System.out.println("Task 3 — CompareArrays: ");
        String[] arr1 = new String[] {"123", "123", "123"};
        String[] arr2 = new String[] {"123", "123", "123"};
        CompareArrays.compareArrays(arr1, arr2);

        // Second task
        System.out.println("\nTask 2 — Calculator: ");
        System.out.println("10 + 10.2 = " + Calculator.sum(10, 10.2).floatValue());
        System.out.println("222.2315 / 1.780 = " + Calculator.divide((double) 222.2315, (short) 1.780).doubleValue());





    }
}