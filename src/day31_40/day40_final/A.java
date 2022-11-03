package day31_40.day40_final;

public class A {
    String isim="Cuneyt";
    final static String OKUL="Yildiz Koleji";
    /*
    Bir variable final olarak tanimlandiysa baska class'lardan veya icinde oldugumuz class'tan bu variable'a
    baska deger atanmasi mumkun degildir

    Madem ki degeri degistirilemiyor genelde static de yaparak bu variable'a erisim kolaylastirilabilir
    Genelde static final olarak belirlenen variable isimleri BUYUK HARFLE yazilir
     */

    final void finalMethod(){
        System.out.println("final methodlar override edilemez");
        /*
        bir methodu final olarak isaretlerseniz bu method degistirilemez demektir(override edilemez)
         */
    }
}