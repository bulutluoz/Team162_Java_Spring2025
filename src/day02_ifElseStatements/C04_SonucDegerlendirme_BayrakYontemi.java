package day02_ifElseStatements;

import java.util.Scanner;

public class C04_SonucDegerlendirme_BayrakYontemi {

    public static void main(String[] args) {
        // Kullanicidan iki tamsayi isteyin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 2 tamsayi giriniz...");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        // girilen sayilara gore asagidaki degerlendirmeleri yazdirin
        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk"

        int flag = 25;
        // flag'a herhangi bir data turundeki
        // herhangi bir degeri atayabilirsiniz

        if (sayi1<sayi2){
            System.out.println("birinci sayi daha kucuk");
            flag = 40;
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk"
        if (sayi1>0){
            System.out.println("birinci sayi sifirdan buyuk");
            flag = 40;
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk"
        if (sayi2>50){
            System.out.println("ikinci sayi 50'den buyuk");
            flag = 40;
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati"
        if (sayi2 % 5 == 0){
            System.out.println("ikinci sayi 5'in tam kati");
            flag = 40;
        }

        // kullanicinin gireecegi degerleri bilmiyoruz
        // ama flag'in alabilecegi degerlerin 25 veya 40'dan biri olacagini biliyoruz

        // 5- EGER konsolda yukardakilerden hicbiri yazdirilmazsa
        //    "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin
        //     flag hala 25 olmali

        if (flag == 25){
            System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");
        }

    }
}
