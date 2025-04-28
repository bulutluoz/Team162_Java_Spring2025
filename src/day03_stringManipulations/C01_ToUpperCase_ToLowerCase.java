package day03_stringManipulations;

import java.util.Locale;

public class C01_ToUpperCase_ToLowerCase {

    public static void main(String[] args) {

        String str = "Java cok guzel bir dil";

        System.out.println(str.toUpperCase()); // JAVA COK GUZEL BIR DIL

        System.out.println(str); // Java cok guzel bir dil

        str = str.toUpperCase(); // JAVA COK GUZEL BIR DIL

        System.out.println(str); // JAVA COK GUZEL BIR DIL


        // klavyem ingilizce

        System.out.println(str = str.toLowerCase()); // java cok guzel bir dil

        System.out.println(str); //  java cok guzel bir dil

        // EGER bir harfin kucuk/buyuk yazilimi bir dilde ilgilizce'den farkli ise

        // ç-> c  Ç-> C
        // ı     I           i    İ
        //           i   I
        // ingilizce'deki i harfinin kucuk/buyuk yazimi
        // Turkce'de farkli harflere karsilik geliyor


        //  java cok guzel bir dil
        // JAVA COK GUZEL BİR DİL

        System.out.println("Geleneksel cince : " +  str.toUpperCase(Locale.TRADITIONAL_CHINESE)  );
        // Geleneksel cince : JAVA COK GUZEL BIR DIL

        System.out.println("Turkce : " + str.toUpperCase(Locale.forLanguageTag("Tr")));
        // Turkce : JAVA COK GUZEL BİR DİL





    }
}
