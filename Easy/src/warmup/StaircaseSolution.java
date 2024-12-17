package warmup;

import java.io.*;

class ResultStaircase {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        for(int i = 0 ;i<n;i++){

            for(int j = 0 ;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j = n-i-1 ;j<n;j++){
                System.out.print("#");
            }
            System.out.println();
        }

    }

}

public class StaircaseSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        ResultStaircase.staircase(n);

        bufferedReader.close();
    }
}
