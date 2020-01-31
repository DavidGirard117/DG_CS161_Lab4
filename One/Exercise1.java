/* Lab 4 Exercise 1
 * David Girard
 * CS 161 winter 2020
 * 1/30/20
 * Using for, while, and do while loops; show numbers 1 through ten
 */
public class Exercise1 {

    public static void main(String[] args) {

        System.out.print("for: ");
        for (int i=1; i<11; i++) {
            System.out.print(i+" ");
        }
            System.out.println(" ");
        System.out.print("while: ");
        int i = 1;
        while (i<11) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println(" ");
        System.out.print("do...while: ");
        do {
           i++; 
        }while (i<11); 
        System.out.print(i+" ");
   
    }   

}