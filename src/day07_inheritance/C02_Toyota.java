package day07_inheritance;

public class C02_Toyota extends C01_Araba{

    /*
        1- baslangic itibariyle child class'daki her obje
           parent class'daki ozelliklere sahip olur

        2- child class isterse ve ortak ozellik varsa
           parent class'daki ozellikleri guncelleyebilir

        3- child class isterse ve ortak ozellik varsa
           parent class'da olmayan
           yeni ozellikler ekleyebilir
     */

    String marka = "Toyota";
    String motor = "Toyota Motor";
    String lastik = "Pirelli";
    String guvenlik = "Toyota guvenlik standardi";



    public static void main(String[] args) {

        C02_Toyota  toyota1 = new C02_Toyota();
        // 1.madde
        System.out.println(toyota1.motor); // Motor secenegi belirtilmedi
        System.out.println(toyota1.kasa); // Kasa secilmedi

        //2.madde
        System.out.println(toyota1.marka); // Toyota
        System.out.println(toyota1.motor); // Toyota Motor

        // 3.madde
        System.out.println(toyota1.lastik); // Pirelli
        System.out.println(toyota1.guvenlik); // TGS

    }

}
