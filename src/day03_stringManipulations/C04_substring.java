package day03_stringManipulations;

public class C04_substring {

    public static void main(String[] args) {

        String str = "Java ile hersey kolay";

        System.out.println(str.substring(1)); // ava ile hersey kolay

        System.out.println(str.substring(5)); // ile hersey kolay

        System.out.println(str.length()); // 21

        System.out.println( str.substring(18)  ); // lay
        System.out.println(str.charAt(18)); // l


        // sondan 5.index'deki karakteri yazdirin
        System.out.println(  str.charAt(   str.length()-5   )   ); // k

        // son 5 karakteri yazdirin
        System.out.println(  str.substring(   str.length()-5  )); // kolay


        System.out.println(   str.substring( str.length()-1)    ); //  y
        System.out.println(   str.charAt( str.length()-1)    ); // y


        System.out.println( "substring'de length yazilirsa : " +  str.substring( str.length())    ); //  hiclik
        // System.out.println(   str.charAt( str.length())    ); // StringIndexOutOfBoundsException


        // System.out.println(   str.substring( str.length()+1)    ); //  y
        // System.out.println(   str.charAt( str.length()+1)    ); // y



        // substring ile 2 parametre yazilirsa

        // str ==> Java ile hersey kolay

        System.out.println(  str.substring(0,4));  // Java
        // Java'da genel olarak baslangic index'leri Inclusive(dahil) iken
        // bitis index'leri exclusive(haric) olur
        // 43.satirdaki kod 0.index'deki karakterden basla
        // 4.index'deki karakter'e kadar (4.index'deki karakter haric)
        // olan metni dondurur

        System.out.println(  str.substring(10,14));  // erse

        // System.out.println(  str.substring(14,10));  // Java
        // StringIndexOutOfBoundsException: begin 14, end 10, length 21


        System.out.println(  str.substring(10,11));  // e
        System.out.println(str.charAt(10));


        System.out.println(  str.substring(5,6));  // i
        System.out.println(str.charAt(5));


        System.out.println(  str.substring(1,2));  // a
        // kullanimda chartAt(1) ile substring(1,2) arasinda kullanisli bir fark vardir
        // ikisi de a harfini getirir
        // ama charAt() char olarak getirdigi icin hazir method'lari olmaz
        // str.charAt(1).    method yok
        // str.substring(1,2) kullanirsak bize String getirir
        // biz de string ile hazir method'lari kullanabiliriz

        System.out.println(  str.substring(1,2).toUpperCase());
        System.out.println(  str.substring(1,2).equals("A"));
        System.out.println(  str.substring(1,2).equalsIgnoreCase("A"));

        System.out.println(  str.substring(3,4));  // a


        System.out.println(str.substring(6, 6)); // hiclik
        // ilk 6 bize "6.index'deki l'den basla" der
        // ikinci 6 bize "bitis index'leri dahil olmaz, 6'yi birak" der
        // geriye hiclik kalir


    }
}
