package allPractices.practiceday13_interviewQuestions;

import java.util.Scanner;

public class Q03 {
    /*
  Crteate a program checks if a String is PALINDROME or not.
  If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
  For Example : "madam" or "nursesrun" .
  Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
  polindrome :tersten okunuşu da aynı olan ifadeierdir.
  ornek : Ey edip Adanada pide ye,  Traş niçin şart
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" palindrom olup olmadığını görmek için bir ifade giriniz");
        String input = scan.next();
        String tersInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);
        }
        if(input.equals(tersInput)){
            System.out.println("palindrom");
        }else {
            System.out.println("palindrom degil");
        }
    }
}
/*
Scanner scan=new Scanner(System.in);
        System.out.print("String giriniz: ");
        String str=scan.nextLine();
        String tersStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersStr+=str.substring(i,i+1);
        }if(str.equalsIgnoreCase(tersStr)){
            System.out.println("Palnidrom'dur");
        }else {
            System.out.println("Palindrome degildir");
        }
 */
