public class Methods {
    public static void main(String[] args) {
                     compare(10,1,13);
    }
    public static void compare(int a,int b, int c) {
        if (a < b) {
            if (a < c) {
                System.out.println("The Smallest Value is :" + a);
            } else {
                System.out.println("The Smallest Value is :" + c);
            }
        } else if (b < c) {
            System.out.println("The Smallest Value is :" + b);
        } else {
            System.out.println("The Smallest Value is :" + c);


        }

    }
    }