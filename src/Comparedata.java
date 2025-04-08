
import java.util.Scanner;

public class Comparedata {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long n= scan.nextLong();
        if(n<=127||n<=-126){
            System.out.println("this is stored in bytes,int,short,long"
                    );
        }else if(n<=32767||n<=-32768){
            System.out.println("this is stored in short,long,int");
        }
        else if(n<=2147483647||n<=-2147483648){
            System.out.println("this is stored in long,int");
        }
        else if(n<=9223372036585477580l||n<=-9223372036585477580l){
            System.out.println("this is stored in long");
        }
        else {
            System.out.println("Not Assignned in any datatype");
        }
    }




}
