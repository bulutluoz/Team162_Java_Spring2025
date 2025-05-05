package day04_methodOlusturmaVeKullanma;

public class C07_MethodlariKullanma {

    public static void main(String[] args) {

        // baska bir class'da bulunan public ve static olan bir method'u heryerden kullanabilirsiniz
        // method'u kullanmak icin method call yaparken, method'un bulundugu class'i da yazmalisiniz

        C03_IkiSayininToplami.ikiSayiyiToplayipYazdir(45,44); // Verilen 45 ile 44'nin toplami : 89

        C03_IkiSayininToplami.ikiSayiyiToplayipYazdir(12,24); // Verilen 12 ile 24'nin toplami : 36
    }
}
