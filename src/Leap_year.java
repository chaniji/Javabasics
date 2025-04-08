public class Leap_year {
    public static void main(String[] args) {
int a=2017;
if(a%4==0)//TRUE
     {if(a%100==0)//TRUE
     {
    if(a%400==0){
        System.out.println("THIS IS A LEAP YEAR");

    }else{
        System.out.println("THIS IS NOT  A LEAP YEAR ");
    }
}
//DIVIDED BY 1O CONDITION =FALSE
else{
    System.out.println("THIS IS A LEAP YEAR");
}
}
//DIVIDE BY 4 CONDITION=FALSE
else {
    System.out.println("THIS IS NOT  A LEAP YEAR ");
}
















}}


