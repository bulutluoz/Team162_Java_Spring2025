package day08_abstraction;

public abstract class C03_Araba {

    /*
     araba class'i araba olarak satilacak tum araclarin
     bulundurmak zorunda oldugu ozellikleri belirlemek icin olusturulmustur

     Eger Araba Class'i bugune kadar olusturdugumuz diger class'lar gibi olursa
     Klasik bir parent Class olur ve Child class'lar icin KURAL KOYAMAZ

     1- Araba class'ini olusturanlar
        bu Class'in Klasik bir Class mi yoksa Kural koyan bir Class mi olacagina
        KARAR VERMELIDIR

        EGER Kural koyacak bir class olmasi isteniyorsa
        bunun Class deklarasyonunda belirtilmesi gerekir

        Class deklarasyonuna eklenecek "abstract" keyword'u
        bu Class'in kural koyucu bir Class olacagini deklare eder

     2- Class'i olusturanlarin karar vermesi gereken 2.konu
        bu class'daki method'lardan
        HANGILERININ child class'lar icin MECBURI OLACAGI,
        hangilerinin ise child class'lar icin MECBURI OLMAYACAGIDIR

     3- Zorunlu olmayan method'lar
        bugune kadar olusturdugumuz gibi devam eder

        AMMMMAAAAA
        zorunlu olmasini istedigimiz method'larin
        bugune kadar olusturdugumuz method'lardan farkli olmali

        parent class'da child class'larin mecburi uyarlamasini istedigimiz method'lari
        abstract olarak isaretlemeliyiz

     */

    public abstract void motor(); // zorunlu
    // Abstract methods cannot have a body
    // Abstract method'lar body'e sahip olamaz

    // abstract method'lar normal calisacak method'lar degil
    // standartlarda gecen kural koyucu cumleler gibidir
    // ornegin bu method standart'da bulunan asagidaki cumle islevini yapar
    // "Child class'lar MUTLAKA motor() bulunmalidir"

    public abstract void teker(); // zorunlu

    public void klima(){
        System.out.println("Arabalar istege bagli olarak klima bulundurabilir");
    } // zorunlu degil

    public void sunroof(){
        System.out.println("Arabalar istege bagli olarak sunroof bulundurabilir");

    }// zorunlu degil


    public static void main(String[] args) {

        // C03_Araba araba = new C03_Araba();
        // 'C03_Araba' is abstract; cannot be instantiated
        // Araba Class'i abstract bir class oldugu icin
        // Araba Class'indan OBJE OLUSTURULAMAZ

        // araba.motor();
        // EGER java abstract class'dan obje olusturulmasina izin verseydi
        // body'si olmayan motor() method'unun calismasi mumkun olmayacagi icin
        // KOD HATA VERIRDI
    }
}
