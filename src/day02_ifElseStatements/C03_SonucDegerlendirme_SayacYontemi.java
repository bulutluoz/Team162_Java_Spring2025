package day02_ifElseStatements;

import java.util.Scanner;

public class C03_SonucDegerlendirme_SayacYontemi {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin

        int sayac = 0;

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"
        if (sayi1<sayi2){
            System.out.println("birinci sayi daha kucuk");
            sayac++;
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1>0){
            System.out.println("birinci sayi sifirdan buyuk");
            sayac++;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        if (sayi2>50){
            System.out.println("ikinci sayi 50'den buyuk");
            sayac++;
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
            sayac++;
        }


        // kullanicinin gireecegi degerleri bilmiyoruz
        // ama sayacin alabilecegi degerlerin 0, 1, 2, 3, 4 'den biri olacagini biliyoruz


        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        if (sayac == 0){
            System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");
        }

        // 6- EGER girilen sayilar tum sartlari sagliyorsa
        //    "Tebrikler, cok guzel sayilar secmissiniz :) " yazdirin

        if (sayac == 4){
            System.out.println("Tebrikler, cok guzel sayilar secmissiniz :) ");
        }

    }
}
