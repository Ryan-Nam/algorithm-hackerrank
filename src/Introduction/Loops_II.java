/*
We use the integers a, b, and n to create the following series:

You are given q queries in the form of a, b, and n. For each query,
print the series corresponding to the given a, b, and n values as a single line of  space-separated integers.

Input Format
The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.
 */
package Introduction;


import java.util.Scanner;

public class Loops_II {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        

        for(int i=0;i<t;i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                a += b * (int) Math.pow(2, j); // 2, j=2 => 4
                System.out.print(a + " ");
            }
            System.out.println();

        }
        in.close();
    }
}
