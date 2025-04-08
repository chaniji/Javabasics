import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {
                    Scanner scan =new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int number=scan.nextInt();
        sof(number);


    }
    public static void sof(int a){
        int lastDigit,sum=0;
        while(a>0){
             lastDigit=a%10;
             sum=sum+lastDigit;
             a=a/10;
        }
        System.out.println("The Sum of Digits:"+sum);
    }

}





