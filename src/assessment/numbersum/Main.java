package assessment.numbersum;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("This program will take a number and add the multiple of 3 and 5 between 1 and that number. ");
	    System.out.println("Enter your number here: ");
	    int x = scan.nextInt();
	    System.out.println(returnSumIfDivisible(x));

    }
    private static int returnSumIfDivisible(int x){
        int sum = 0;
        for (int i = 0; i<x; i++){
            if((i%3==0)||(i%5==0)){
                sum+=i;
                System.out.println("Multiple is " + i);
            }
        }
        return sum;
    }
}
