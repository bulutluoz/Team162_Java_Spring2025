package day06_staticKeyword;

public class C03_BaskaClassdanKullanim {

    public static void main(String[] args) {

        /*
         baska class'daki static variable ve method'lara ulasmak icin
         java'nin belirledigi erisim yontemi
         classIsmi.staticVariableIsmi seklindedir

         EGER static bir variable'i
         obje ismi ile kullanmak isterseniz
         Java CTE vermez (altini kirmizi cizmez)
         ama sariya boyayarak bizi uyarir

         static bir class uyesine NICIN
         instance yontemle(obje uzerinden) ulasiyorsun der.
         */




        // hastane class'indaki hastaneIsmi'ni yazdirin
        System.out.println(C01_Hastane.hastaneIsmi); // Yildiz Hastanesi

        // hastane class'indaki hastaneAdresi'ni yazdirin
        System.out.println(C01_Hastane.hastaneAdresi); // Cankaya


        C01_Hastane per1 = new C01_Hastane();
        System.out.println(per1.hastaneAdresi); // Cankaya
        // Static member 'hastaneAdresi' accessed via instance reference
        // static olan 'hastaneAdresi' bilgisine instance yontemle erisildi



    }
}
