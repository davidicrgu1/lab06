/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab06.pkg1;

/**
 *
 * @author 1904912
 */
import java.util.Scanner;
public class PasswordCheck {
    public static boolean isCorrectLength(String word){
        if(word.length() >=8)
            return true;
        else
            return false;       
    }
    public static boolean containsDigit(String word){
        for(int i=0; i<word.length();i++)
            if(Character.isDigit(word.charAt(i)))
                return true;
        return false;
    }
    public static boolean containsUpper(String word){
        for(int i =0; i<word.length(); i++)
            if(Character.isUpperCase(word.charAt(i)))
                return true;
        return false;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = input.next();
        
        if(isCorrectLength(password) && containsDigit(password)&& containsUpper(password))
            System.out.println("good password!");
        else
            System.out.println("bad password!");
    }
    
}
