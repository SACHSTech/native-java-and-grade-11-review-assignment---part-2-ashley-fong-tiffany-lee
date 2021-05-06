package gr11review.part2;

import gr11review.part2.Utility.*;
import java.io.*;
import java.util.Arrays;

/* 
* Grade 11 Java Review Part 2
* @author: T. Lee
*
*/

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
  
    // Methods 1
    System.out.println(Utility.zipZap("zipXzap"));

    // FileIO = Read 1
    System.out.println(Utility.longestWord("src/gr11review/part2/words.txt"));


  }
  
}