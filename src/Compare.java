import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,c,d;
        a=scan.nextInt();
        b= scan.nextInt();
        c=scan.nextInt();
        d=scan.nextInt();
         if(a==b&&c==d){
             System.out.println("EQUALS");
         }
    else{
             System.out.println("NOT EQUAL");
         }
    }


}
