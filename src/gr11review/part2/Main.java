package gr11review.part2;

import gr11review.part2.Utility.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.io.*;

public class Main { 
  public static void main(String[] args) throws IOException {
                                                 
    // Methods 1
    String str = "zipXzap";
    System.out.println(Utility.zipZap(str));
                                                             
                                                             
    //testing method 2
    String userInput = "aa11b33";
    int numberSum;

    numberSum = Utility.sumNumbers(userInput);

    System.out.println("The sum of the digits is " +numberSum); 
        
                                                     
    // FileIO = Read 1
    System.out.println(Utility.longestWord("src/gr11review/part2/words.txt"));
    

    //testing fileio 2
    String alpha; 

    alpha = Utility.alphaWord("src/gr11review/part2/words.txt"); 

    System.out.println("The word that is alphabetically first is " +alpha); 
             
                                                                                                     
    // Array 1 - One Dimensional 
    int[] nums = {1, 10, 2, 20, 30, 40};
    nums = Utility.tenRun(nums);
    System.out.println(Arrays.toString(nums));


    //testing arrays 2 
    //int[] nums = {1, 2, 3, 2, 5, 2};
    int value = 2; 
    Utility array2 = new Utility(); 

    System.out.println("The new array is " +java.util.Arrays.toString(array2.notAlone(nums, value))); 


    //Array 3 - One Dimensional - Two Loops
    int[] outer = {1, 2, 4, 6};
    int[] inner = {1, 4};
                                                             
    System.out.println(Utility.linearIn(outer, inner));
                                                 
    
    //testing arrays 4
    int[] number = {1, 1, 1, 2, 1};
    boolean balance = Utility.canBalance(number); 

    System.out.println("The sums can balance: " +balance); 
     
                                                        
    //Array 5 - Two Dimensional
    int i=5; 
    int j=4; 
    Utility.pascalTri(i, j);               


    //testing arrays 6
    int n = 3; 

    Utility.diagonal(n); 

  }
}

