package day05_arrays;

public class C05_ArrayinElemanlariniTerstenYazdirma {

    public static void main(String[] args) {

        // verilen bir sayilar array'indeki tum sayilari
        // sondan basa dogru, aralarinda bir bosluk olacak sekilde
        // yan yana yazdirin

        int[] sayilar = {4,8,0,2,5,7,1};

        for (int i = sayilar.length-1 ; i >= 0 ; i--) {

            System.out.print(sayilar[i] + " ");

        }

        // 1 7 5 2 0 8 4
    }
}
