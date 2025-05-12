package day05_arrays;

public class C04_ArraydekiEnUzunIsmiYazdirma {

    public static void main(String[] args) {

        // verilen String bir array'deki en uzun elemani yazdirin
        // ayni uzunluktaki isimlerden hangisi oldugu onemli degil

        String[] isimler = {"Avsar","Can","Ahmet Mert","Mustafa","Nesim","Onur",};


        String enUzunKelime = isimler[0];

        for (int i = 1; i < isimler.length ; i++) {
            // 0.index'deki ismi enUzunKeleime olarak atadigimiz icin
            // tekrar 0.index'deki kendisi ile karsilastirmaya gerek yok

            if (  isimler[i].length() > enUzunKelime.length() ){
                enUzunKelime = isimler[i];
            }

        }

        System.out.println("Array'deki en uzun kelime : " + enUzunKelime);
        // Array'deki en uzun kelime : Ahmet Mert

    }
}
