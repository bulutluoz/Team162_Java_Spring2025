package day05_arrays;

public class C03_ArrayinTumElementleriniToplama {

    public static void main(String[] args) {

        // verilen sayilar array'inin tum elemanlarinin toplamini yazdirin

        int[] sayilar = {3,5,7,8,3,4,6,7,2};

        // Eger istenen gorevde array'in tum elementlerini elden gecirmemiz gerekiyorsa
        // bir for loop olusturmaliyiz

        int toplam = 0 ;


        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i];

        }

        System.out.println("Array'deki elementlerin toplami : " + toplam); // 45

    }
}
