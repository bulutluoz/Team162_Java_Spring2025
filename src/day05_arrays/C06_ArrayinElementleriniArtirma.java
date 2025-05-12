package day05_arrays;

import java.util.Arrays;

public class C06_ArrayinElementleriniArtirma {

    public static void main(String[] args) {
        // Verilen bir int array’in
        // tum elemanlarini istenen sayi kadar artirip
        // arrayin son halini donduren bir method olusturun.
        // Eski array’i yeni haliyle kaydedin.

        int[] sayilar = {4,7,1,8,3,5,7};
        int artisMiktari = 2;

        sayilar = arrayinElementleriniArtir(sayilar,artisMiktari);

        System.out.println( "Array'in son hali : " + Arrays.toString(sayilar));


    }

    public static int[] arrayinElementleriniArtir( int[] sayilar , int artisMiktari ){

        for (int i = 0; i < sayilar.length; i++) {

            sayilar[i] = sayilar[i] + artisMiktari;

        }

        return sayilar;
    }
}
