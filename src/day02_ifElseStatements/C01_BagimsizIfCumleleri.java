package day02_ifElseStatements;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        int a = -33;
        int b = -7;

        // a b'den buyukse "a daha buyuk" yazdirin

        if (a > b){
            System.out.println("a daha buyuk");
        }

        /*
            verilen boolean sart
            verilen degerlere gore false olursa
            IF BODY calismaz

            AMMMMAAAA bu if statement'in calismadigi anlamina gelmez

            if statement kendi gorevini yapti,
            sarti kontrol etti
            ve degerler sarti saglamadigi icin
            degerlerin if body'sine girmesini engelledi

            bu durumda
            if statement calisti
            ama if body DEVREYE GIRMEDI deriz


            konsolda cikan
            Process finished with exit code 0
            yazisi, kodun problemsiz olarak calisip
            sona erdigini bize rapor eder

            kodlarin calismasinda sorun olsaydi
            sonuc kodu 0 disinda bir deger alirdi
         */

        // b sayisi cift ise "b sayisini sevdim" yazdirin
        if (b % 2 == 0){
            System.out.println("b sayisini sevdim");
        }

        // a sayisi 5'in kati ise "a sayisini sevdim" yazdirin
        if (a % 5 == 0){
            System.out.println("a sayisini sevdim");
        }

        // b sayisi 0'dan buyukse "b pozitif" yazdirin
        if (b>0){
            System.out.println("b pozitif");
        }


        /*
            Bagimsiz if cumleleri
            isminden de anlasilacagi uzere
            kodun geri kalanindan bagimsiz olarak calisir

            her bagimsiz if cumlesi
            SADECE kendi boolean sartina odaklanir
            diger if cumlelerinin sonuclari veya
            baska kod olup olmadigi ile ilgilenmez

            birden fazla bagimsiz if cumlesi varsa
            hepsinin body calisacabilecegi gibi,
            hicbir if body'sinin calismamasi da mumkundur
         */



    }
}
