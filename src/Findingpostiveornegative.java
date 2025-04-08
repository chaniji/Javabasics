import java.util.Scanner;
public class Findingpostiveornegative {
    public static void main(String[] args) {
                  Scanner scan= new Scanner(System.in);
                  System.out.println("ENTER A NUMBER:");
                  int a=scan.nextInt();

                  if(a>0){
                      System.out.println("THIS IS A POSITIVE NUMBER");
                  }
                  else {
                      System.out.println("THIS IS A NEGATIVE NUMBER");
                  }}

    public static class Average
    {
        public static void main (String args[]){
            Scanner scn=new Scanner(System.in);
            int a,b,c,d,e;
            System.out.println("ENTER A FIRST NUMBER");
            a=scn.nextInt();
            System.out.println("ENTER A SECOND NUMBER");
            b=scn.nextInt();
            System.out.println("ENTER A THIRD NUMBER");
            c=scn.nextInt();
            System.out.println("ENTER A FOURTH NUMBER");
            d=scn.nextInt();
            System.out.println("ENTER A FIFTH NUMBER");
            e=scn.nextInt();
            System.out.println("THE AVERAGE OF THREE NUMBER: "+(a+b+c+d+e)/5);


        }
    }
}

