package day04_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C01_HazirMethodKullanma {

            /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi index'deki karakteri yazdirin

            Kurallar :
            1- eger girilen index metnin  sinirlari disinda ise hata verin
            2- index 0'dan kucukse hata mesaji verin
         */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("bastan kacinci karakteri yazdirmak istersiniz ?");
        int kacinciKarakter = scanner.nextInt();


        System.out.println(metin.charAt(kacinciKarakter-1));


          /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i negatif veya metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

         */

        int baslangicIndex = 2;
        int bitisIndex = 6;

        System.out.println(metin.substring(baslangicIndex, bitisIndex)); // i to


    }

}
