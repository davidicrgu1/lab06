/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06.p5;
import java.util.Scanner;
/**
 *
 * @author 1904912
 */
public class Lab06P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter word to reverse: ");
        String word = input.next();
        System.out.println(reverse(word));
        input.close();
    }

    public static String reverse(String str) {
        if (str.length() > 1) {
            return reverse(str.substring(1)) + str.charAt(0);
        }
        return str;
    }
}
    