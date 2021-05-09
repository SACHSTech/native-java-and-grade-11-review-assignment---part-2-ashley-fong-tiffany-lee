package gr11review.part2;

import gr11review.part2.Utility.*;
import java.io.*;
import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

/* 
* Grade 11 Java Review Part 2
* @author: T. Lee
*
*/

//Test

public class Main{
  public static void main(String[] args) throws IOException{
    BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
  
    // Methods 1
    String str = "zipXzap";
    System.out.println(Utility.zipZap(str));

    // FileIO = Read 1
    System.out.println(Utility.longestWord("src/gr11review/part2/words.txt"));
    
    // Array 1 - One Dimensional 
    int[] nums = {1, 10, 2, 20, 30, 40};
    nums = Utility.tenRun(nums);
    System.out.println(Arrays.toString(nums));


    //Array 3 - One Dimensional - Two Loops
    int[] outer = {1, 2, 4, 6};
    int[] inner = {1, 4};

    System.out.println(Utility.linearIn(outer, inner));

    //Array 5 - Two Dimensional
    int i=5; 
    int j=4; 
    Utility.pascalTri(i, j);

  }
  
}