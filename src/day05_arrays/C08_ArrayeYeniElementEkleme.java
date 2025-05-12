package day05_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C08_ArrayeYeniElementEkleme {
    public static void main(String[] args) {

        int[] arr = {4,7,8};

        // arr array'ine 4.eleman olarak 1 ekleyin

        // arr[3] = 1;

        // varolan bir array'e yeni elemant ekleyemeyiz
        // ammmmmaaaa istenen degerleri tasiyoan bir array olusturup
        // bunu arr'e deger olarak atayabiliriz

        // yaniiii once {4,7,8,1} arrayini olusturup
        // sonra bu array'i deger olarak eski array'e atay7alim

        int[] yeniArr = {4,7,8,1};

        arr = yeniArr;


        System.out.println("Arr'nin son hali : " + Arrays.toString(arr));

        // verilen bir array'in sonuna istenen bir degeri ekleyip
        // donduren bir method olusturun.

        int[] rakamlar = {1,2,3,4};
        int eklenecekSayi = 5;

        // once yeni bir array olarak istenen arrayi olusturalim

        int[] yeniArr1 = new int[rakamlar.length+1]; // [0, 0, 0, 0, 0]

        for (int i = 0; i < rakamlar.length; i++) {

            yeniArr1[i] = rakamlar[i];
        }

        System.out.println(Arrays.toString(yeniArr1)); // [1, 2, 3, 4, 0]

        // yeni array'in son elementi olarak
        // eski array'e eklenmek istenen sayiyi atayalim
        yeniArr1[yeniArr1.length-1] = eklenecekSayi;

        System.out.println(Arrays.toString(yeniArr1)); // [1, 2, 3, 4, 5]


    }

    public static int[] arrayeElemanEkle(int[] rakamlar, int eklenecekSayi){

        int[] yeniArr1 = new int[rakamlar.length+1];

        for (int i = 0; i < rakamlar.length; i++) {

            yeniArr1[i] = rakamlar[i];
        }

        // System.out.println(Arrays.toString(yeniArr1)); // [1, 2, 3, 4, 0]

        // yeni array'in son elementi olarak
        // eski array'e eklenmek istenen sayiyi atayalim
        yeniArr1[yeniArr1.length-1] = eklenecekSayi;

        return yeniArr1;
    }
}
