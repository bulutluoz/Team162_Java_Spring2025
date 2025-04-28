package day03_stringManipulations;

public class C02_CharAt {

    public static void main(String[] args) {


        String str = "Java cok guzel";

        System.out.println(str.charAt(0)); // J

        System.out.println( str.charAt(4)); // " "

        System.out.println( str.charAt(7)); // k


        // str'da kac karakter var ?  ==>  14
        // str'da son karakter olan l'nin index'i kac ?  ==> 13

        // str'in son karakterini yazdirin
        System.out.println( str.charAt( 13 )); // l


        // eger verilen metnin karakter sayisini biliyorsak
        // son karakteri yazditmak icin

        // System.out.println( str.charAt( str'in karakter sayisi - 1 )); // l


        // "Java cok guzel";  ==> karakter sayisi 14

        // System.out.println(  str.charAt(14));

        // StringIndexOutOfBoundsException: String index out of range: 14
        // String'de verilen index String'in sinirlari disinda


        System.out.println(  str.charAt(44));
        // StringIndexOutOfBoundsException: String index out of range: 44




    }
}
