import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    
    for(int row=0; row<=num;row++){
      int col=0;
      System.out.println("");
      while(col<=num-row-1){
        System.out.print("*");
        col++;
      }
    }
  }
}
