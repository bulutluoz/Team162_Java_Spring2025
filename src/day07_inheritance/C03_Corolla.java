package day07_inheritance;

public class C03_Corolla extends C02_Toyota {

        /*
        1- baslangic itibariyle child class'daki her obje
           parent class'daki ozelliklere sahip olur

        2- child class isterse ve ortak ozellik varsa
           parent class'daki ozellikleri guncelleyebilir

        3- child class isterse ve ortak ozellik varsa
           parent class'da olmayan
           yeni ozellikler ekleyebilir
     */

    String model = "Corolla";
    String lastik = "Pirelli Turkiye";
    String aku = "inci aku";
    String renk = "Renk belirtilmedi";


    public static void main(String[] args) {

        C03_Corolla corolla1 = new C03_Corolla();

        // 1.madde
        System.out.println(corolla1.marka); // Toyota
        System.out.println(corolla1.kasa); // Kasa secilmedi

        // 2.madde
        System.out.println(corolla1.model); // Corolla
        System.out.println(corolla1.lastik); // Pirelli Turkiye

        // 3.madde
        System.out.println(corolla1.aku); // inci aku
        System.out.println(corolla1.renk); // Renk belirtilmedi


        C03_Corolla corolla2 = new C03_Corolla();
        System.out.println(corolla2.renk); // Renk belirtilmedi
        System.out.println(corolla2.aku); // inci aku
        System.out.println(corolla2.lastik); // Pirelli Turkiye
        System.out.println(corolla2.model); // Corolla
        System.out.println(corolla2.guvenlik); // Toyota guvenlik standardi
        System.out.println(corolla2.motor); // Toyota Motor
        System.out.println(corolla2.marka); // Toyota
        System.out.println(corolla2.kasa); // Kasa secilmedi
        System.out.println(corolla2.sanzuman); // Sanzuman secilmedi

        corolla2.renk = "Mavi";
        corolla2.sanzuman = "Otomatik vites";
        corolla2.kasa = "Hatchback";



    }

}
