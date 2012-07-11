/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.students.u54347781.compro.ch02;

/**
 *
 * @author User
 */
public class Precedence01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println(1 + 2 * 3); // 7
       System.out.println((1 + 2) * 3); // 9
       System.out.println(1 + (2 * 3)); // 7
    }
}
