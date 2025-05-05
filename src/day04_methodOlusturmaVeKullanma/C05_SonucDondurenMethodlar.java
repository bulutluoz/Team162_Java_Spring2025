package day04_methodOlusturmaVeKullanma;

public class C05_SonucDondurenMethodlar {

    public static void main(String[] args) {
        // bir sayi verildiginde
        // sayi cift ise true,
        // sayi tek ise false donduren bir method olusturun

        /*
            bir sonuc return eden ( void olmayan) method'lar
            String ile kullandigimiz hazir method'lara benzer

                    String str = "hava";
                    str.length();   => integer bir sonuc dondurur   4
                    str.charAt(1);  => char bir sonuc dondurur      'a'
                    str.substring(1,3); => String bir sonuc dondurur    "av"

           ammmmaaa
           yazdirmadigimiz icin bu dondurulen sonuclari konsolda goremeyiz
           kaydetmedigimiz icin bu dondurulen sonuclari sonradan kullanamayiz

         */

        sayiCiftMi(34);
        // yazdirmadigimiz icin bu dondurulen sonuclari konsolda goremeyiz
        // kaydetmedigimiz icin bu dondurulen sonuclari sonradan kullanamayiz


        System.out.println(  sayiCiftMi(44) ); // true
        // yazdirdigimiz icin bu dondurulen sonucu konsolda goruruz
        // kaydetmedigimiz icin bu dondurulen sonucu sonradan kullanamayiz


        boolean ciftMi57 = sayiCiftMi(57); // false
        // yazdirmadigimiz icin bu dondurulen sonucu konsolda goremeyiz
        // kaydetdigimiz icin bu dondurulen sonucu sonradan kullanabiliriz

        // 57 ciftse "ben bu konuyu sevmedim" yazdirin
        // 57 tekse "ben javayi cok seviyorum"

        if (ciftMi57 == true){
            System.out.println("ben bu konuyu sevmedim");
        } else {
            System.out.println("ben javayi cok seviyorum");
        }





    }

    public static boolean sayiCiftMi(int sayi){

        boolean ciftMi = true;

        if (sayi % 2 == 0){
            ciftMi = true;
        } else {
            ciftMi = false;
        }


        return ciftMi;
    }


}
