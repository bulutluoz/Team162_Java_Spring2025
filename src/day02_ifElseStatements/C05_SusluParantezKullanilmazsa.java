package day02_ifElseStatements;

import java.util.Scanner;

public class C05_SusluParantezKullanilmazsa {

    public static void main(String[] args) {


        // kullanicidan iki tamsayi alin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();


        // sayi1 pozitif ise
        // iki ayri sout ile "sayi1 pozitif" ve "pozitif sayilari severim" yazdirin


        if (sayi1>0)
            System.out.println("sayi1 pozitif"); // if body sadece bu satir olur
            System.out.println("*** her deger icin calisir---pozitif sayilari severim"); // if body'si ile ilintili degil;
            // kullanici hangi degeri girerse girsin, 25.satir calisir



        // sayi2 cift ise
        // iki ayri sout ile "sayi2 cift sayi" ve "Cift sayilari severim" yazdirin

        if (sayi2 % 2 == 0)
            System.out.println("sayi2 cift sayi"); // if body sadece bu satir olur
            System.out.println("*** her deger icin calisir---cift sayilari severim"); // if body'si ile ilintili degil;
        // kullanici hangi degeri girerse girsin, 35.satir calisir


        // EGER if cumlesinde {} kullanilmazsa
        // Java if body olarak ilk ;'e kadar olan kismi alir
        // ilk ;'den sonraki satirlarin if statement ile ilgisi YOK der




    }
}
