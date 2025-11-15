/*
WAP to print below print
*
**
***
****
*****
******
*/
package starPattern;

public class starPattern2 {
    public static void main(String[] args) {
//row count
        for(int j=0;j<=5;j++){
            //column count
            for(int k=0;k<=j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
}}
