package org.example;

import java.util.Objects;

public class CompareArrays<T> {

    public static <T> boolean compareArrays(T[] arr1, T[] arr2)
    {
        if (arr1 == null && arr2 == null) return false;

        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++)
            if (!Objects.equals(arr1[i], arr2[i])) return false;

        System.out.println("true");
        return true;
    };
}
