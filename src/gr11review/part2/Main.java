package gr11review.part2;

import java.io.*;
import gr11review.part2.Utility.*;
import java.util.Arrays.*; 

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //testing method 2
    String userInput = "aa11b33";
    int numberSum;

    numberSum = Utility.sumNumbers(userInput);

    System.out.println("The sum of the digits is " +numberSum); 

    //testing fileio 2
    String alpha; 

    alpha = Utility.alphaWord("src/gr11review/part2/words.txt"); 

    System.out.println(alpha); 

    //testing arrays 2 

    int[] nums = {1, 2, 3, 2, 5, 2};
    int value = 2; 
    Utility array2 = new Utility(); 

    System.out.println("The new array is " +java.util.Arrays.toString(array2.notAlone(nums, value))); 

    //testing arrays 4
    
    int[] number = {1, 1, 1, 2, 1};
    boolean balance = Utility.canBalance(number); 

    System.out.println("The sums can balance: " +balance); 

    //testing arrays 6

    int n = 3; 

    Utility.diagonal(n); 

  }
}
