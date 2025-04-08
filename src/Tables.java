import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        int i,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER A NUMBER:");
        i=scan.nextInt();
        for(n=1;n<=10;n++){
            System.out.println((i+"X"+n+"="+i*n));
        }}}

