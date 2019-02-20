/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_room101;
import java.util.Scanner;
/**
 *
 * @author 1904912
 */
public class Lab06_room101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter length l: ");
        double length = input.nextDouble();
        System.out.print("Please enter breadth b: ");
        double breadth = input.nextDouble();
        System.out.print("please enter height h: ");
        double height = input.nextDouble();
        System.out.print ("please enter costPerSqM m: ");
        double costPerSqM = input.nextDouble();
        System.out.print ("please enter numCarpetTiles c: ");
        double numCarpetTiles = input.nextDouble();
        input.close();

        System.out.println(area(length, breadth));
        System.out.println(wallArea(length, height));
        System.out.println(volume(length, breadth, height));
        System.out.println(carpetCost(length, breadth, costPerSqM));
        System.out.println(wallPaintCost(length, breadth, height, costPerSqM));
        System.out.println(numofTiles(length, breadth));
        System.out.println();
    }
        
        public static double area(double l, double b) {
            return  l * b;
        }
            public static double wallArea(double l, double h) {
                return l * h;
            }
                public static double volume(double l, double b, double h) {
                    return l * b * h;
                }
                    public static double carpetCost (double l, double b, double m) {
                        return l * b * m;
                    }
                                public static double wallPaintCost (double l, double b, double h, double m) {
                                    return l * b * h * m;
                                }
                                    public static double numofTiles (double l, double b) {
                                    return l * b;
                                }
                }
            
            
            
            
        
        
        
      
       
 