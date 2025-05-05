package day04_methodOlusturmaVeKullanma;

public class C02_ReturnType {

    public static void main(String[] args) {

        String str = "Java candir";

        str.charAt(3);
        /*
            9.satirda charAt() calisti ve soz verdigi gibi
            3.index'deki 'a' yi dondurdu

            ama bunu yazdirmadigimiz icin konsolda gormedik
            kaydetmedigimiz icin bunu kodun ilerleyen asamalarinda da kullanamayiz
         */


        str.length();

        // length() dondurdugu sonucu direkt olarak konsolda gormek istersek
        // yazdirabiliriz
        System.out.println(str.length()); // 11


        // metni ilk harfi buyuk, geriye kalanlar kucuk olacak sekilde duzenleyip
        // yeniMetin olarak kaydedin

        String yeniMetin = str.substring(0,1).toUpperCase()+ str.substring(1).toLowerCase();

        // 29.satirda toUpperCase() ve toLowerCase() calisti
        // biz de yeni halini kaydettik
        // yeniMetin'i yazdirmak zorunda degiliz, cunku gorevde yazdirmamiz degil
        // kaydetmemiz istenmis, biz de kaydettik

        System.out.println("Metnin yeni hali : " + yeniMetin);
    }
}
