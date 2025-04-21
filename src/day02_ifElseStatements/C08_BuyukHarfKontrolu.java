package day02_ifElseStatements;

import java.util.Scanner;

public class C08_BuyukHarfKontrolu {

    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz...");

        char girilenKarakter = scanner.next().charAt(0);
        // kullanici a girse girilenKarakter==> 'a'
        // kullanici Ali girse girilenKarakter==> 'A'
        // kullanici Ali Can Yilmaz girse girilenKarakter==> 'A'


        // 1.yontem ASCII table
        // ASCII table'da buyuk harfler A ile Z arasindadir

        if (girilenKarakter >= 'A' && girilenKarakter <= 'Z'){
            // girilen karakter A ile Z arasinda ise
            System.out.println("girilen karakter buyuk harf");

        } else {
            // girilen karakter A ile Z arasinda degil ise
            System.out.println("girilen karakter buyuk harf degil");

        }


        // Character Class'indan method kullanma

        if (Character.isUpperCase(girilenKarakter))  System.out.println("girilen karakter buyuk harf");
        else System.out.println("girilen karakter buyuk harf degil");

    }
}
