import java.util.Scanner;

public class Sumofnumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number,lastdigit,sum=0,count;
        System.out.println("ENTER THE NUMBER:");
        number=scan.nextInt();
             count=String.valueOf(number).length();
             while(number>0){
                 lastdigit=number%10;
                 sum=sum+lastdigit;
                 number=number/10;

             }
        System.out.println("The Sum of Digits:"+sum);
        double c=sum/count;
        System.out.println("The Average of number"+c);
    }
}
