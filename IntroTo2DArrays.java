import java.util.Arrays;

public class IntroTo2DArrays
{
  public static void main(String[] args)
  {
    int[][] ray = new int[2][3];
    
    ray[0][0] = 1;
    ray[0][1] = 2;
    ray[0][2] = 3;
    ray[1][0] = 4;
    ray[1][1] = 5;
    ray[1][2] = 6;

    /*
       1  2  3 
       4  5  6
    */

    System.out.println(ray);

    //print the first array in the array ray
    System.out.println(ray[0]);

    //System.out.println(Arrays.toString(ray[0]));
    //System.out.println(Arrays.toString(ray[1]) + "\n");

    for(int row = 0; row < ray.length; row++)
      System.out.println(Arrays.toString(ray[row]));

    //==============================================================================================================================================================================
    //change every value in the 2D array to 7
    //ray[#].length is the number of col in the array
    for(int row = 0; row < ray.length; row++)
      for(int col = 0; col < ray[row].length; col++)
        ray[row][col] = 7;
    
    System.out.println("");
    for(int row = 0; row < ray.length; row++)
      System.out.println(Arrays.toString(ray[row]));
    
    //==============================================================================================================================================================================
    //fill the array with random numbers from 0 to 10 inclusive
    for(int r = 0; r < ray.length; r++)
      for(int c = 0; c < ray[r].length; c++)
        ray[r][c] = (int)(Math.random()*11 + 0);

    System.out.println("");
    for(int row = 0; row < ray.length; row++)
      System.out.println(Arrays.toString(ray[row]));

    System.out.println("");

    //==============================================================================================================================================================================
    //find the sum of each row
    int sum;

    for(int r = 0; r < ray.length; r++)
    {
      sum = 0;

      for(int c = 0; c < ray[r].length; c++)
        sum += ray[r][c];

      System.out.println("The sum of row " + r + " is " + sum );
    }

      //==============================================================================================================================================================================
      //add up the columns of each row using for each loops...

      System.out.println("\n\nHomework:");

      int add = 0;

      for(int[] row : ray)
      {
        for(int c : row)
          add += c;
      }

      System.out.println("The sum of the values in the array is " + add);
  }
}
