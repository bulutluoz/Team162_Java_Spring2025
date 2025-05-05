package day04_methodOlusturmaVeKullanma;

public class C06_SifreKontrol {

    public static void main(String[] args) {

        //Soru 4 : Kverilen sifreyi inceleyip,
        //         asagidaki sartlari kontrol eden
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyip
        //         eger tum sartlari saglarsa, true,
        //         sartlardan saglanmayan varsa false donduren bir method olusturun

        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        System.out.println(sifreGecerliMi("ali153")); // false
        // sifrenin uzunlugu en az 10 karakter olmali (method'un icinde yazdirdi)


        System.out.println(sifreGecerliMi("ali 153tjkiub")); // false
        // son karakter rakam olmali (method'un icinde yazdirdi)
        // sifre bosluk icermemeli

        System.out.println(sifreGecerliMi("aliMert56789")); // true


    }

    public static boolean sifreGecerliMi( String sifre ){

        int sayac = 0;


        //         - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0);

        if ( ! Character.isLowerCase(ilkHarf) ){
            System.out.println("ilk harf kucuk harf olmali");
            sayac++;
        }

        //         - son karakter rakam olmali

        char sonKarakter= sifre.charAt( sifre.length()-1);

        if ( !Character.isDigit(sonKarakter) ){
            System.out.println("son karakter rakam olmali");
            sayac++;
        }

        //         - sifre bosluk icermemeli

        if ( sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            sayac++;
        }

        //         - uzunlugu en az 10 karakter olmali

        if ( !(sifre.length() > 10) ){
            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");
            sayac++;
        }


        /*
            basta sayaca 0 degeri atadik
            4 kontrol yaptik
            sona gelindiginde sayac 0 - 1 - 2 - 3 - 4 olabilir

            sayac 0 ise hic hata yok sonucunu cikarabilir
            sayac 0 degilse sifre hatalidir sonucu cikar
         */

        if (sayac == 0){
            return true;
        } else {
            return false;
        }

    }
}
