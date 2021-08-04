/*
Java has 8 primitive data types;
- byte, short, int, long => (Integer)
- float, double => (Real Number)
- boolean => (Logical)
- char => (String)

For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer. - 8 bit
A short is a 16-bit signed integer. - 16 bit
An int is a 32-bit signed integer. - 32 bit
A long is a 64-bit signed integer. - 64 bit

float - 32 bit
double - 64bit

Given an input integer, you must determine which primitive data types are capable of properly storing that input.
To get you started, a portion of the solution is provided for you in the editor.

Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 */
package Introduction;

import java.util.Scanner;

public class Datatypes {
    public static void main(String []args)
    {
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();

        for(int i=0;i<t;i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println("* byte");
                //Complete the code
                if (x >= -32768 && x <= 32767) System.out.println("* short");
                if (x >= (int) Math.pow(-2, 31) && x <= ((int) Math.pow(2, 31))-1) System.out.println("* int");
                if (x >= (int) Math.pow(-2, 63) && x <= ((int) Math.pow(2, 63))-1) System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
