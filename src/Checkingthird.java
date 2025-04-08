import java.util.Scanner;
public class Checkingthird {
    public static void main(String[] args) {
               Scanner scan=new Scanner(System.in);
        System.out.println("Enter the FIRST NUMBER:");
        int a= scan.nextInt();
        System.out.println("Enter the SECOND NUMBER:");
        int b= scan.nextInt();
        int c=a+b;
        System.out.println("Enter  the THIRD NUMBER:");
        int d= scan.nextInt();
        if(c==d){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }

    }
}
