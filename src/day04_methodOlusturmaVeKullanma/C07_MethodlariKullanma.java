package day04_methodOlusturmaVeKullanma;

import java.util.Scanner;

public class C07_MethodlariKullanma {

    public static void main(String[] args) {

        // baska bir class'da bulunan public ve static olan bir method'u heryerden kullanabilirsiniz
        // method'u kullanmak icin method call yaparken, method'un bulundugu class'i da yazmalisiniz

        C03_IkiSayininToplami.ikiSayiyiToplayipYazdir(45,44); // Verilen 45 ile 44'nin toplami : 89

        C03_IkiSayininToplami.ikiSayiyiToplayipYazdir(12,24); // Verilen 12 ile 24'nin toplami : 36

        C04_IsmiDuzenlemeMethodu.ismiDuzenleYazdir("ali"); // A**

        C04_IsmiDuzenlemeMethodu.ismiDuzenleYazdir("ali yilmaz"); // A** Y*****

        C04_IsmiDuzenlemeMethodu.ismiDuzenleYazdir("ali can yilmaz"); // A** C** Y*****

        // kullanicidan bir sayi isteyin
        // kullanicinin girdigi sayi cift ise "Yasasin 1000 TL kazandiniz" yazdirin
        // sayi cift degilse "sonra bir daha sansinizi deneyin"


        System.out.println(C06_SifreKontrol.sifreGecerliMi("asdfgh234567890")); // true


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz...");

        int sayi = scanner.nextInt();

        if (C05_SonucDondurenMethodlar.sayiCiftMi(sayi) == true){
            System.out.println("Yasasin 1000 TL kazandiniz");
        } else {
            System.out.println("sonra bir daha sansinizi deneyin");
        }

    }
}
