package day05_arrays;

import java.util.Arrays;

public class C07_ArrayeYeniDegerAtama {

    public static void main(String[] args) {


        int[] sayilar = {3,5,7};

        // sayilar array'ine elemanlari 5,6,7,8 olan yeni bir array atayin

        // sayilar = {5,6,7,8};
        // varolan bir array'e yeni bir deger atamak isterseniz
        // bunu liste yontemi ile yapamazsiniz

        // bunun yerine once yeni bir array olusturup
        int[] yeniArr = {5,6,7,8};

        // sonra eski array'e deger olarak yeni array'i atama yapariz
        sayilar = yeniArr;

        System.out.println("Sayilar array'inin son hali : " + Arrays.toString(sayilar));
        // Sayilar array'inin son hali : [5, 6, 7, 8]

    }
}
