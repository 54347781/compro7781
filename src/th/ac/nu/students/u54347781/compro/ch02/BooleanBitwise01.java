/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.students.u54347781.compro.ch02;

/**
 *
 * @author User
 */
public class BooleanBitwise01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int A = 1234;
        final int B = 9876;
        System.out.println("A = " + Integer.toBinaryString(A));
        System.out.println("B = " + Integer.toBinaryString(B));
        System.out.println("A & B = " + Integer.toBinaryString(A & B));
        System.out.println("A | B = " + Integer.toBinaryString(A | B));
        System.out.println("A ^ B = " + Integer.toBinaryString(A ^ B));
        System.out.println("A >> 4 = " + Integer.toBinaryString(A >> 4));
        System.out.println("A << 4 = " + Integer.toBinaryString(A << 4));
        System.out.println("~A = " + Integer.toBinaryString(~A));
        System.out.println("-A = " + Integer.toBinaryString(-A));
        System.out.println("-A >> 4 = " + Integer.toBinaryString(-A >> 4));
        System.out.println("-A >>> 4 = " + Integer.toBinaryString(-A >>> 4));
    }
}
