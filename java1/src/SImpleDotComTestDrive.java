/**
 * Created by shaojianxuan on 2018/3/1.
 */
/*import java.io.*;
public class GameHelper{
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        inputLine = is.readLine();
        if (inputLine.length() == 0) return null;
        }catch (IOException e){
         System.out.println("IOE");
        }
    }
}


class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }
    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        /for(int cell : locationCells){
            if (guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;

    }
}
*/


