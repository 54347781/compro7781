package th.ac.nu.students.u54347781.compro.ch03;
import java.util.Scanner;
public class IfStatement02 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = Integer.parseInt(in.next());
        double num2 = Integer.parseInt(in.next());
        if (num2 == 0) {
            System.out.println("Error: divide by zero!");

        } else {
            System.out.println(num1 / num2);
        }       
    }
}
