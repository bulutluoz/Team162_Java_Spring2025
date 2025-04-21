package day02_ifElseStatements;

import java.util.Scanner;

public class C09_BuyukHarfeCevir {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen karakteri girildigi gibi yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz...");

        char girilenKarakter = scanner.next().charAt(0);


        // 1- ASCII table kullanarak
        if (girilenKarakter>='a' && girilenKarakter<='z'){
            System.out.println( "Girilen kucuk harfin buyuk hali : " + (char) (girilenKarakter-32) );
        } else {
            System.out.println("Girdiginiz karakter : " + girilenKarakter);
        }


        // 2- Character class'indan hazir method

        if ( Character.isLowerCase(girilenKarakter)){
            System.out.println( "Girilen kucuk harfin buyuk hali : " + Character.toUpperCase(girilenKarakter));
        }else {
            System.out.println("Girdiginiz karakter : " + girilenKarakter);
        }
    }
}
