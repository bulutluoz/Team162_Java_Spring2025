package day03_stringManipulations;

public class C03_Equals {

    public static void main(String[] args) {


        int a = 20;
        int b = 30;

        System.out.println( a == b ); // false

        System.out.println( b == a+10 ); // 30  == 30 ==> true

        // non-primitive'lerde == kullanilir mi ?

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = new String("Ali");
        String a1 = "A";
        String a2 = "li";
        String s4 = a1 + a2 ;
        String s5 = "A" + "l" + "i";

        System.out.println(  s1 == s2  );  // Ali == Ali ==> true
        System.out.println(  s1 == s3  );  // Ali == Ali ==> false
        System.out.println(  s1 == s4  );  // Ali == Ali ==> false
        System.out.println(  s1 == s5  );  // Ali == Ali ==> true
        System.out.println(  s1 == "Ali"  );  // Ali == Ali ==> true


        // String'de (ve aslinda tum non-primitive'lerde)
        // karsilastirma == ile yapilmaz
        // String'de Metin'lerin ayni oldugunu kontrol etmek icin
        // equals() kullanilir

        System.out.println("==========");
        System.out.println(  s1.equals(s2) );  // Ali equals Ali ==> true
        System.out.println(  s1.equals(s3) );  // Ali equals Ali ==> true
        System.out.println(  s1.equals(s4) );  // Ali equals Ali ==> true
        System.out.println(  s1.equals(s5) );  // Ali equals Ali ==> true
        System.out.println(  s1.equals("Ali") );  // Ali equals Ali ==> true



        String k1 = "Ali";
        String k2 = "ali";
        String k3 = "ALI";
        String k4 = "aLi";
        String k5 = "A li";
        String k6 = "Ali ";
        String k7 = "Ali.";
        String k8 = "Ali Nazik";
        System.out.println("==========");
        System.out.println(  k1.equals(k2) );  // Ali equals ali ==> false
        System.out.println(  k1.equals(k3) );  // Ali equals ALI ==> false
        System.out.println(  k1.equals(k4) );  // Ali equals aLi ==> false
        System.out.println(  k1.equals(k5) );  // Ali equals A li ==> false
        System.out.println(  k1.equals(k6) );  // Ali equals "Ali " ==> false
        System.out.println(  k1.equals(k7) );  // Ali equals Ali. ==> false
        System.out.println(  k1.equals(k8) );  // Ali equals Ali Nazik ==> false



        // EGER metnin ayni oldugunu kontrol ederken
        // SADECE buyuk kucuk harf farkliliklarini gormezden gelmesini isterseniz

        System.out.println("==========");
        System.out.println(  k1.equalsIgnoreCase(k2) );  // Ali equals ali ==> true
        System.out.println(  k1.equalsIgnoreCase(k3) );  // Ali equals ALI ==> true
        System.out.println(  k1.equalsIgnoreCase(k4) );  // Ali equals aLi ==> true
        System.out.println(  k1.equalsIgnoreCase(k5) );  // Ali equals A li ==> false
        System.out.println(  k1.equalsIgnoreCase(k6) );  // Ali equals "Ali " ==> false
        System.out.println(  k1.equalsIgnoreCase(k7) );  // Ali equals Ali. ==> false
        System.out.println(  k1.equalsIgnoreCase(k8) );  // Ali equals Ali Nazik ==> false


    }
}
