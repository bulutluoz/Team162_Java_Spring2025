package day04_methodOlusturmaVeKullanma;

public class C04_IsmiDuzenlemeMethodu {

    public static void main(String[] args) {

        // verilen kullanici ismini
        // Kullanici 3 isimli olsa da
        // isimlerin ilk harfi buyuk harf, kalanlar * olacak sekilde yazdirin
        // Ornek input  : ali mert can
        //       output : A** M*** C**

        ismiDuzenleYazdir("ali haydar"); // A** H*****

        ismiDuzenleYazdir("hasan"); // H****

        ismiDuzenleYazdir("ali mert can"); // A** M*** C**


    }


    public static void ismiDuzenleYazdir(String isim){
        int ilkSpaceIndex = isim.indexOf(" ");
        int ikinciSpaceIndex = isim.indexOf(" ", ilkSpaceIndex+1);



        // once kelime sayisini int olarak bulalim

        int kelimeSayisi = 0;

        if (ilkSpaceIndex == -1){
            kelimeSayisi = 1;
        } else if ( ikinciSpaceIndex == -1) {
            kelimeSayisi = 2;
        } else{
            kelimeSayisi = 3;
        }


        switch (kelimeSayisi){

            case 1 : // tek kelimeli isim   mehmet

                System.out.println(
                        isim.substring(0,1).toUpperCase()+
                                isim.substring(1).replaceAll("\\w","*")
                );

                break;

            case 2 : // iki kelimeli isim   mehmet ali

                System.out.println(
                        isim.substring(0,1).toUpperCase()+
                                isim.substring(1,ilkSpaceIndex).replaceAll("\\w","*")  +
                                " "+
                                isim.substring(ilkSpaceIndex+1, ilkSpaceIndex+2).toUpperCase()+
                                isim.substring(ilkSpaceIndex+2).replaceAll("\\w","*")
                );


                break;

            default: // iki kelimeden fazla isim   ali mert can

                System.out.println(
                        isim.substring(0,1).toUpperCase()+
                                isim.substring(1,ilkSpaceIndex).replaceAll("\\w","*")  +
                                " "+
                                isim.substring(ilkSpaceIndex+1, ilkSpaceIndex+2).toUpperCase()+
                                isim.substring(ilkSpaceIndex+2,ikinciSpaceIndex).replaceAll("\\w","*")+
                                " "+
                                isim.substring(ikinciSpaceIndex+1,ikinciSpaceIndex+2).toUpperCase()    +
                                isim.substring(ikinciSpaceIndex+2).replaceAll("\\w","*")
                );


        }



    }
}
