package day05_arrays;

public class C01_ArrayOlusturma {


    public static void main(String[] args) {


        int sayi = 2;
        String str = "Java candir";

        int[] arr = {2,4,7,9};

        String[] isimler = {"Avsar","Ahmet","Nesim","Onur"};

        char harfler[] = {'a','r','y','t','o'};
        // bu tur kullanimi intelliJ sariya boyayarak bizi uyaririyor
        // [] isimden sonra degil,
        // icine konulacak elementlerin data turunden sonra yazilmalidir

        // arr, isimler ve harfler variable'larinin data turu Array'dir
        // bunlarin array oldugunu bize ve java'ya anlatan [] dir
        // array'in basinda yazilan int, String ve char ise
        // array'in icine konulacak elementlerin data turudur

        // 30 kisilik 3-A sinifi olusturalim
        String[] ucASinifi = new String[30];

        ucASinifi = new String[32];

        ucASinifi = new String[40];

        // icine 5 tane tamsayi koyabilecegimiz bir array olusturun
        int[] sayilar = new int[5];


        String metin = "Java Guzeldir";

        // metin'de kac karakter kullanilmis?

        System.out.println( metin.length() ); // 13


        int[] rakamlar = {5,4,7,1,3};
        System.out.println(  rakamlar.length ); // 5

        // rakamlar array'inin icindeki ilk sayiyi yazdirin

        System.out.println(  rakamlar[0]  ); // 5


        // rakamlar array'inin icindeki ucuncu sayiyi yazdirin
        System.out.println(  rakamlar[2] ); // 7

        // System.out.println( rakamlar[22]  );
        // ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 5

    }
}


