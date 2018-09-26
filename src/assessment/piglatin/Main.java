package assessment.piglatin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program will take a sentence and turn it into pig latin. ");
        System.out.println("Enter your sentence here: ");
        String sentence = scan.next();
        System.out.println(pigLatin(sentence));


    }
    public static String pigLatin(String sent){
        String[] list = sent.split();
    }
}
