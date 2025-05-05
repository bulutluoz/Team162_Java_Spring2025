package day04_methodOlusturmaVeKullanma;

public class C03_IkiSayininToplami {

    public static void main(String[] args) {

        // method'u olusturmak, calismasi icin yeterli degildir
        // method'un calismasi icin MUTLAKA method Call (method'u cagirma) yapilamlidir

        ikiSayiyiToplayipYazdir(20,30); // Verilen 20 ile 30'nin toplami : 50

        ikiSayiyiToplayipYazdir(-34,23); // Verilen -34 ile 23'nin toplami : -11

        ikiSayiyiToplayipYazdir(-20,20); // Verilen -20 ile 20'nin toplami : 0



    }


    // verilen iki sayiyi toplayip, sonucu yazdiran bir method olusturun

    public static void ikiSayiyiToplayipYazdir(int sayi1, int sayi2){

        System.out.println("Verilen " + sayi1 + " ile " + sayi2 + "'nin toplami : " + (sayi1 + sayi2));

    }



}
