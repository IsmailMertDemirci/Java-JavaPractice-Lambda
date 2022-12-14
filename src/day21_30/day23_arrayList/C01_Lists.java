package day21_30.day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Lists {

    public static void main(String[] args) {
        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);

        System.out.println("Listenin boyutu : "+sayilar1.size());

        sayilar1.add(2);
        sayilar1.addAll(sayilar1);
        System.out.println(sayilar1);//[5, 3, 2, 2, 5, 3, 2, 2]
        System.out.println("Listenin boyutu : "+sayilar1.size());

        sayilar1.set(2,8);
        System.out.println(sayilar1);//[5, 3, 8, 2, 5, 3, 2, 2]

        System.out.println(sayilar1.set(0,12));//5
        System.out.println(sayilar1);//0. indexe 12 koydu ve sonucu yazdirdi [12, 3, 8, 2, 5, 3, 2, 2]

        //set methodu istenen indexdeki eski elementi silip yerine yeni elementi set eder
        //eger eski elementi silmek istemiyorsak add(index,deger) methodunu kullanabiliriz
        //set() methodu sildigi eski elementi bize dondurur o yuzden (0,12) de 5 verdi

    }
}
