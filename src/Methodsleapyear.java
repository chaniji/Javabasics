public class Methodsleapyear {
    public static void main(String[] args) {
        year(2017);
    }
    public static void year(int a){
        if(a%4==0){
            if(a%100==0){
                if(a%400==0){
                    System.out.println("THIS IS LEAP YEAR");
                }
                else{
                    System.out.println("THIS IS NOT LEAP YEAR");
                }
            }
        else{
                System.out.println("THIS IS LEAP YEAR");
            }
        }
        else{
            System.out.println("THIS IS NOT LEAP YEAR");
        }
    }

}
