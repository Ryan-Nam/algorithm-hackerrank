/*
Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, N print its first 10 multiples. Each multiple N x i (where 1 <= i 10) should be printed on a new line in the form: N x i = result.

Input Format
A single integer, N

Constraints
2<= N <= 20

Output Format
Print 10 lines of output; each line i (where 1<= i <= 10) contains the result of N x i in the form:
N x i = result.
 */
package Introduction;

import java.io.*;
import java.nio.Buffer;

public class Loops_I {
    public static void main (String[] arg) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i=1; i<11; i++){
            bw.write(N + " x " + i + " = " + N*i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
