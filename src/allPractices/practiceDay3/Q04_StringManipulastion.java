package allPractices.practiceDay3;

import java.util.Scanner;

public class Q04_StringManipulastion {
    /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.next();

        char ortanca=str.charAt((str.length()-1)/2);

        if(str.length()%2==1 && str.length()>=3){
            System.out.println("ortanca karakter :"+ortanca);
        }
    }
}
