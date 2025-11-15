/*
Print the below pattern
 ******
 *****
 ****
 ***
 **
 *
*/
package starPattern;

public class starPattern3 {
    public static void main(String[] args) {

        for(int j=0;j<=5;j++){

            for(int k=5;k>=j;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
