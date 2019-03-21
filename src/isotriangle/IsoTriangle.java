/*
 * Quentin Magoon
 * March 19, 2019
 * Program asks user for triangle size
 * Program then prints out triangle
 */

package isotriangle;

import javax.swing.JOptionPane;


public class IsoTriangle {

    /*
    * drawBar
    * Prints out stars for triangle
    * User must input requested triangle size
    * Then prints out stars when called apon from main
    */
    public static void drawBar(int length){
         
        for (int i = 1; i <= length; i++) {
            System.out.print("*");
        }
        System.out.println();
        
    }
    /*
    * addSpaces
    * Adds spaces for triangle
    * Triangle size must be indicated
    * Determines the amount of spaces required on each line
    */    
    public static void addSpaces(int length){
    

        for (int j = 1; j <= j; j++) {
            System.out.print(" ");
        }
      System.out.println();
    }
    
    public static void main(String[] args) {
        
        //asks user for size of triangle
        String size = JOptionPane.showInputDialog("Enter size of triangle: ");
        //converts string to integer
        int trianglesize = Integer.parseInt(size);
        
        //prints out triangle
        for (int i = 1; i <= trianglesize; i++) {
            drawBar(i);
            addSpaces(i);
      } 
    }
}
