import java.util.Scanner;

public class Factorial

{
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
        int i,f=1;
        for (i=1;i<=n;i++){
            f=f*i;


        }
        System.out.println(f);
    }

}
