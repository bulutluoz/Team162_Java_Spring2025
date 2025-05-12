package day05_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C09_Arrays {

    public static void main(String[] args) {

        // asagidaki int array'in sonuna 9 ve 10 ekleyin

        int[] arr = {3,9,1};

        arr = C08_ArrayeYeniElementEkleme.arrayeElemanEkle(arr,9);
        arr = C08_ArrayeYeniElementEkleme.arrayeElemanEkle(arr,10);

        System.out.println("arr'nin son hali : " + Arrays.toString(arr));
        // arr'nin son hali : [3, 9, 1, 9, 10]



    }
}
