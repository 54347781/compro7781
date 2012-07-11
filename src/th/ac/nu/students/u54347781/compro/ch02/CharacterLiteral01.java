/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.nu.students.u54347781.compro.ch02;

/**
 *
 * @author User
 */
public class CharacterLiteral01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Backspace = <\b>");
        System.out.println("New line = <\n>");
        System.out.println("Return = <\r>");
        System.out.println("Formfeed = <\f>");
        System.out.println("Tab = <\t>");
        System.out.println("Backslash = <\\>");
        System.out.println("Single quote = <\'>");
        System.out.println("Double quote = <\">");
        System.out.println("Null = <\0>");
        
        System.out.println("\u0048\1451\u006c\157"); // Hello
        System.out.println('\u0e01'); // ก
        System.out.println('ก'); // ก
    }
}
