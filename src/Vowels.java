import javax.swing.text.DefaultStyledDocument;
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A VOWLES:");
        char b = scan.next().charAt(0);
        char[] vowels = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';


        for (int i = 0; i <= 4; i++) {

            if (vowels[i] == b) {

                System.out.println("THIS IS VOWELS");

            }

        }
    }

}












