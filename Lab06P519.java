/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06.p5.pkg19;
import java.util.Scanner;
/**
 *
 * @author 1904912
 */
public class Lab06P519 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a: ");
        int a = input.nextInt();
        System.out.println("Please enter n: ");
        int n = input.nextInt();
        input.close();

        System.out.println(compute(a, n));
    }

    public static int compute(int a, int n) {
        if (n == 1) {
            return a;
        } else if (n % 2 == 0) {
            return compute(a, n / 2) * compute(a, n / 2);
        } else {
            return a * compute(a, n - 1);
        }
    }
}
   