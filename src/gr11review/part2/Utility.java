package gr11review.part2;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Utility {

  /*
  * Method 1
  * Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp" for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
  *
  * @param str, the string being tested
  * @return str output aka the new string with the above criteria 
  * @author T. Lee
  *
  */

  public static String zipZap(String str){
      
    // Declare + initalize varibales
    String output = ""; 

    //looks through the string to find 'z' and 'p', two positions apart. removes the character in between and the output becomes 'zp' + rest of the word
    for (int i = 0; i < str.length(); i++) {
        if (i + 2 < str.length() && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
          output += "zp";
          i += 2;
        }
        else {
          output += str.charAt(i);
        }
      }

      // Return output string
      return output;
      
  }

  /*
  * FileIO - Read 1
  * Finds + returns the longest string (word) in a text file. 
  *
  * @param name of the file (words.txt)
  * @return longest word in the file
  * @author T. Lee
  *
  */
  public static String longestWord(String filenametxt) throws IOException {

    BufferedReader key = new BufferedReader(new FileReader(filenametxt));

    // Declare + initalize variable
    String longest = ""; 
    String current = key.readLine(); 

    //loop runs until it reaches the end of file. 
    while(current != null){

      //takes the current word and compares it to the previous word that was the longest. if the current word is longer than the longest, the current word will become the new longest word
      if(current.length() >= longest.length()){
        longest = current; 
      }
      current = key.readLine(); 
    }

    // close file
    key.close();

    //return the longest word
    return longest;

  }

  /*
  * Array 1 - One Dimensional
  * For each multiple of 10 in the given array, it cahnges all the values following it to be that multiple of 10, until encountering another multiple of 10.
  *
  * @param nums, array
  * @return nums <-- updated version with changes 
  * @author T. Lee
  *
  */

  public static int[] tenRun(int[] nums){
    
    //loop + search through all data in the array
    for(int i = 0; i<nums.length -1; i++){
      // finds the multiple of 10 + if it is not a multiple of 10, it changes to the previous number. 
      if(nums[i] % 10 == 0 ){
        if(nums[i+1] % 10 !=0){
          nums[i+1] = nums[i];
        }
      }
    }
    // returns the updated array
    return nums; 
  }
  
  /*
  *  Array 3 - One Dimensional - Two Loops
  * Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer. The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
  *
  * @param outer array and inner array 
  * @return boolean value - true/false
  * @author T. Lee
  *
  */
  public static boolean linearIn(int[] outer, int[] inner){
    
    //Declare + initalize variables 
    boolean result = false;  
    int count = 0; 
    int[] test = new int [inner.length];

    // loop the entire inner and outer array 
    for( int i = 0; i < inner.length; i++){
      for (int n = 0; n < outer.length; n++){
        // if values of inner and outer loop are equal, the index will have a value of 1
        if(inner[i] == outer[n]){
          test[i] = 1; 
        }
      }
    }

    // checking to see if the value of one is present within the entire array
    for(int i = 0; i < inner.length; i++){
      if(test[i] == 1){
        count++; 
      }else if(test[i] == 0){
        result = false; 
      }
    }

    // if the counter number is equal to the length of the inner array, the value will be true
    if(count == inner.length){
      result = true; 
    }

    // returns the boolean variable
    return result; 

  }

  /*
  * Array 5 - Two Dimensional
  * Given two values - columns + rows - prints out pascals triangle in a text file.
  *
  * @param i <-- number of rows + j <-- number of columns
  * @return Nothing is returned (create + prints onto a textfile)
  * @author T. Lee
  *
  */
  public static void pascalTri(int i, int j) throws IOException{
    
    // Declare array
    int [][] p = new int[i][j]; 
    
    // Fill the first column+row of the array with the '1'
    for( int n = 0; n < i; n++){
      for( int k = 0; k < j; k++){
        p[n][0] = 1; 
        p[0][k] = 1; 
      }
    }
    
    // Fill in the remainder of the array by adding the values to its left and top together.
    for( int n = 1; n < i; n++){
      for( int k = 1; k < j; k++){
          p[n][k] = p[n-1][k] + p[n][k-1];
      }
    }

    // Create a new textfile for writing the values 
    PrintWriter pascalOut = new PrintWriter(new FileWriter("src/gr11review/part2/pascalOut.txt"), false);

    //Print the array into the file 
    for( int n = 0; n < i; n++){
      for( int k = 0; k < j; k++){
        pascalOut.print(p[n][k] + ", ");
        // Each new row prints on a new line
        if(k == j - 1){
        pascalOut.println(" ");
        }
      }
    }

    // Close textfile
    pascalOut.close(); 

  }

}
