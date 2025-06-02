package day08_abstraction;

public class C04_Toyota extends C03_Araba {

    @Override
    public void motor() {
        System.out.println("Toyota araclar cevreci motor kullanir");
        // Child class'lar Abstract Parent class'daki
        // abstract method'lari kendilerine UYARLAMALIDIR
        // yani ayni method'u olusturmali
        // ve body'sini kendine uygun olarak duzenlemelidir
        // Parent Abstract class method'u olusturmaya ZORLAR
        // ama method'un icine karismaz
    }

    @Override
    public void teker() {
        System.out.println("Toyota araclar Pirelli lastik kullanir");
    }
// Class 'C04_Toyota' must either be declared abstract
// or implement abstract method 'motor()' in 'C03_Araba'
// Toyota class'i ya abstract yapilmali,
// ya da parent class'daki motor()'unu kendine uyarlamalidir

// Class 'C04_Toyota' must either be declared abstract or
// implement abstract method 'teker()' in 'C03_Araba'

// klima ve sunroof zorunlu olmadigi icin abstract yapilmamisti
// abstract olmadigi icin child class'lar icin zorunlu degildir
// child class isterse aynen parent class'dan kullanir
// isterse kendine uyarlar
public static void main(String[] args) {

       C04_Toyota toyota1 = new C04_Toyota();
       toyota1.motor(); // cevreci
       toyota1.teker(); // pirelli
       toyota1.klima(); // istege bagli
       toyota1.sunroof(); // istege bagli


    C03_Araba toyota2 = new C04_Toyota();
    toyota2.motor(); // cevreci
    toyota2.teker(); // pirelli
    toyota2.klima(); // istege bagli
    toyota2.sunroof(); // istege bagli

}

}
