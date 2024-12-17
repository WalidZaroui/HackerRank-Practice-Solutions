import java.io.*;

class ResultTimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int hours=Integer.parseInt(s.substring(0,2));
        String timeFormat=s.substring(8,10);
        String newTime;
        if(hours==12 && timeFormat.equals("AM")){
            newTime="00:"+s.substring(3,8);
        }else if(hours!=12 && timeFormat.equals("AM")){
            newTime=s.substring(0,8);
        }else if(hours==12 && timeFormat.equals("PM")){
            newTime=s.substring(0,8);
        }else{
            String updatedHour = Integer.toString(hours+12);
            newTime=updatedHour+":"+s.substring(3,8);
        }
        System.out.println(newTime);
        return newTime;
    }

}

public class TimeConversionSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = ResultTimeConversion.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
