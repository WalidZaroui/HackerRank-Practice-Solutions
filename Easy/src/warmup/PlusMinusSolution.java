package warmup;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class ResultPlusMinusSolution {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Count positive, negative, and zero values
        long positiveCount = arr.stream().filter(num -> num > 0).count();
        long negativeCount = arr.stream().filter(num -> num < 0).count();
        long zeroCount = arr.stream().filter(num -> num == 0).count();

        // Calculate the ratios
        String positiveRatio=String.format("%.6f",(float) positiveCount/arr.size());
        String negativeRatio=String.format("%.6f",(float) negativeCount/arr.size());
        String zeroRatio=String.format("%.6f",(float) zeroCount/arr.size());

        //Print the result
        System.out.println(positiveRatio );
        System.out.println(negativeRatio );
        System.out.println(zeroRatio );
    }

}

public class PlusMinusSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        ResultPlusMinusSolution.plusMinus(arr);

        bufferedReader.close();
    }
}
