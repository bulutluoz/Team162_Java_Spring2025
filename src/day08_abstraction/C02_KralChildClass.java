package day08_abstraction;

public class C02_KralChildClass extends C01_KlasikParentClass{

    /*
        java'da klasik inheritance dusunuldugunde
        Kral child class'dir

        - bir child class istedigi herhangi bir class'i
          extends keyword kullanarak Parent edinebilir

          Parent class kac class'in kendisini parent edindigine,
          veya child class'larin parent class'daki
          variable veya method'lari nasil kullandigina karisamaz

        - child class baslangic itibariyle
          Parent class'daki tum variable ve method'lara sahip olur

        - child class isterse
          parent class'da var olan variable veya method'lari
          kendisine uyarlayabilir

        - child class'lar isterlerse
          parent class'da olmayan
          yeni variable veya method'lar ekleyebilirler
     */

    String adres = "Cankaya";
    int yas;

    public static void main(String[] args) {

    }

    public void method1(){
        System.out.println("child class method1");
    }

    public void method5(){
        System.out.println(isim);
        tel = "544 344 45 46";

        method2(); // parent class method2

        System.out.println(adres); // Cankaya

        method1(); // child class method1
    }
}
