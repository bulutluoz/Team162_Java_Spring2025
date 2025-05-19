package day06_staticKeyword;

import java.util.Scanner;

public class C02_Runner {

    public static void main(String[] args) {
        /*
            static keyword'une sahip variable'lar
            her method'dan rahatca kullanilabildigi icin
            erisim acisindan cok AVANTAJLIDIR

            AMMMMMAAAA
            ulasan herkes static variable'larin degerini degistirebilir
            ve yapilan degisiklik tum objeler icin gecerli olur

            bu durum variable'in degerini yonetmek acisindan DEZAVANTAJLIDIR

            variable'in degerinin bu kadar kolay degistirilmesi
            cok istenen bir durum degildir
         */

        C01_Hastane per1 = new C01_Hastane();

        System.out.println(per1.perIsmi); // isim atanmadi
        System.out.println(per1.yas); // 0
        System.out.println(per1.hastaneIsmi);// Yildiz Hastanesi
        System.out.println(per1.bashekimIsmi); // Dr Yusuf

        per1.perIsmi = "Celal";
        per1.perTelNo = "5322345678";
        per1.yas = 34;

        C01_Hastane per2 = new C01_Hastane();

        System.out.println(per2.perIsmi); // isim atanmadi
        System.out.println(per2.yas); // 0
        System.out.println(per2.hastaneIsmi);// Yildiz Hastanesi
        System.out.println(per2.bashekimIsmi); // Dr Yusuf

        per2.perIsmi = "Nesim";
        per2.perTelNo = "5333442323";
        per2.yas = 35;

        System.out.println(per1.perIsmi); // Celal
        System.out.println(per1.yas); // 34
        System.out.println(per1.hastaneIsmi);// Yildiz Hastanesi
        System.out.println(per1.bashekimIsmi); // Dr Yusuf


        C01_Hastane per3 = new C01_Hastane();

        per3.perIsmi = "Senem";
        per3.perTelNo = "5454545677";
        per3.yas = 29;


        System.out.println(per1.perIsmi); // Celal
        System.out.println(per2.perIsmi); // Nesim
        System.out.println(per3.perIsmi); // Senem


        per1.perIsmi = "Ramazan";

        System.out.println(per1.perIsmi); // Ramazan
        System.out.println(per2.perIsmi); // Nesim
        System.out.println(per3.perIsmi); // Senem

        per1.bashekimIsmi = "Dr Ahmet";


        System.out.println(per1.bashekimIsmi); // Dr Ahmet
        System.out.println(per2.bashekimIsmi); // Dr Ahmet
        System.out.println(per3.bashekimIsmi); // Dr Ahmet

        per2.bashekimIsmi = "Dr Yasar";

        System.out.println(per1.bashekimIsmi); // Dr Yasar
        System.out.println(per2.bashekimIsmi); // Dr Yasar
        System.out.println(per3.bashekimIsmi); // Dr Yasar





    }
}
