/*
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.

It's time to test your knowledge of Static initialization blocks. You can read about it here.
You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth BB and height HH. You should read the variables from the standard input.
If B≤0B≤0 or HH ≤0≤0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
Input Format
There are two lines of input. The first line contains BB: the breadth of the parallelogram. The next line contains HH: the height of the parallelogram.
Constraints
−100≤B≤100−100≤B≤100
−100≤H≤100−100≤H≤100
Output Format
If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
Sample input 1
1
3
Sample output 1
3
*/

package Introduction;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Static_Initializer_Block {

    //initialize B and H
    public static int B;
    public static int H;
    // falg is a simple variable to display ture or false.
    public static boolean flag = true;

    static {
        Scanner sc = new Scanner (System.in);
        B = sc.nextInt(); //the breadth of the parallelogram.
        H = sc.nextInt(); //the height of the parallelogram.
        sc.close();

        try{
            int area = B*H;
            System.out.println(area);
            if (B <= 0 || H <= 0) {
                flag = false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");

            } else {
                flag = true;
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    /*public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    } */// end of main
} // end of class
