package warmup;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultCompareTheTriplets {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> outPutScore=new ArrayList<>();
        int aliceScore=0,bobScore=0;
        for(int i=0;i<a.size();i++){
            if(a.get(i).equals(b.get(i)) ){
                /* nothing to do */
            }else if(a.get(i) < b.get(i)){
                bobScore+=1;
            }else{
                aliceScore+=1;
            }
        }

        outPutScore.add(aliceScore);
        outPutScore.add(bobScore);
        //System.out.println(outPutScore);
        return outPutScore;
    }

}

public class CompareTheTripletsSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = ResultCompareTheTriplets.compareTriplets(a, b);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
