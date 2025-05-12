package day05_arrays;

import java.util.Arrays;

public class C02_ArrayiVeyaTumElemanlariniYazdirma {

    public static void main(String[] args) {

        int[] sayilar = {3,6,7};

        // array'deki tum element'leri yazdirin

        System.out.println( sayilar[0] + " " + sayilar[1] + " " + sayilar[2]  );
        // 3 6 7


        String harfler[] = {"a","r","y","t","o","d","g","h"};
        // tum elemanlarini yazdirin

        for (int i = 0; i < harfler.length ; i++) {

            System.out.print( harfler[i]  + " " );

        } // a r y t o d g h

        System.out.println();


        // sayilar array'ini yazdirin

        System.out.println(sayilar); // [I@1e67b872
        System.out.println(harfler); // [Ljava.lang.String;@3f2a3a5

        // Array non-primitive bir data turudur
        // ve her non-primitive data turu direkt yazdirilamayabilir
        // array'i direkt yazdirmak isterseniz
        // Java array'i degil stack memory'deki referansi yazdirir


        System.out.println(Arrays.toString(sayilar)); // [3, 6, 7]

        System.out.println(Arrays.toString(harfler)); // [a, r, y, t, o, d, g, h]





    }
}
