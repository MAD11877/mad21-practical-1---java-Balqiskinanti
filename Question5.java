import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> numList = new ArrayList<>();
    int totalNum = in.nextInt();

    for(int i=0; i<totalNum;i++){
      int num = in.nextInt();
      numList.add(num);
    }


    int getMode = numList.get(0);
    int maxCount = 0;
    for (int i = 0; i < numList.size(); i++) {
        int value = numList.get(i);
        int count = 1;
        for (int u = 0; u < numList.size(); u++) {
            if (numList.get(u) == value) {
              count++;
            }
            if (count > maxCount) {
                getMode = value;
                maxCount = count; //update maxCount
            }
        }
    }
    System.out.print(getMode);
  }
}
