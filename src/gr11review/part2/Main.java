package gr11review.part2;

import java.io.*;
import gr11review.part2.Utility.*;
import java.util.Arrays.*; 

public class Main { 
  public static void main(String[] args) throws IOException {
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

    //testing method 2
    String userInput;
    int numberSum; 

    System.out.println("Enter a sentence");
    userInput = key.readLine();

    numberSum = Utility.sumNumbers(userInput);

    System.out.println(numberSum); 

    //testing fileio 2
    String alpha; 

    alpha = Utility.alphaWord("src/gr11review/part2/words.txt"); 

    System.out.println(alpha); 

    //testing arrays 2 

    int[] nums = {1, 2, 3, 5, 2};
    int value = 2; 
    Utility array2 = new Utility(); 

    System.out.println("The new array is " +java.util.Arrays.toString(array2.notAlone(nums, value))); 

  }
}
