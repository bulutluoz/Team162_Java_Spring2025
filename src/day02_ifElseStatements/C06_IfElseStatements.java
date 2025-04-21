package day02_ifElseStatements;

import java.util.Scanner;

public class C06_IfElseStatements {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi isteyin
        // sayi cift sayi ise "Girilen sayi cift sayi"
        // sayi cift sayi degilse "Girilen sayi tek sayi"


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0){
            System.out.println("Girilen sayi cift sayi");
        }


        if (sayi % 2 != 0){
            System.out.println("Girilen sayi tek sayi");
        }



        // iki bagimsiz if cumlesi Java'ya extra is yuku anlamina gelir
        // herhangi bir tamsayi icin tek veya cift olmak disinda
        // 3.bir ihtimal olmadigindan
        // sadece cift mi diye kontrol edip,
        // cift degilse tekdir diyebiliriz


        if (sayi % 2 == 0){
            System.out.println("Girilen sayi cift sayi");
        } else {
            System.out.println("Girilen sayi tek sayi");
        }



    }

}
