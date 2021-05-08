package gr11review.part2;
import java.io.*;
import gr11review.part2.Utility.*;

public class Utility {

  /**
  * Given a string with numbers and letters, return the sum of the numbers appearing in the string, ignoring all other characters
  *
  * @param userInput The string that is checked 
  * @return sum of numbers in userInput
  * @author A. Fong
  *
  */
  
  public static int sumNumbers (String userInput) { 
    
    //declaring and initializing variables
    int numSum = 0; 
    int length; 
    String temp = ""; 
    
    //finding the length of the user input
    length = userInput.length();

    //Goes through each character in the string
    for (int i = 0; i < length; i++) { 

      //sees if the current character is a digit
      if (Character.isDigit(userInput.charAt(i))) {
        
        //if the character is a digit, add it to the temporary
        if (i < length - 1 && Character.isDigit(userInput.charAt(i + 1))) {
          temp += userInput.charAt(i); 
        }
      
        //if the character is not a digit, convert the temporary to a integer 
        //resets the temporary so it can read other digits
        else {
          temp += userInput.charAt(i);
          numSum += Integer.parseInt(temp);
          temp = ""; 
        }
      }
    }

    //returns the final sum
    return numSum; 

  }

  /**
  * Given the name of a file that contains a single word on each line, return the word that is alphabetically first
  *
  * @param filenametxt The name of the file that is checked 
  * @return the word that is alphabetically firt
  * @author A. Fong
  *
  */
  
  public static String alphaWord (String filenametxt) throws IOException {
    
    //buffered reader reads file
    BufferedReader file = new BufferedReader (new FileReader(filenametxt));

    //declaring and initialzing variables
    String word = "";
    String alpha = "z"; 

    //loops until a word does not exist
    while (word != null) {
      word = file.readLine();

      //if the word being read is alphabetically ahead (>0) of the current alpha word, replace it to make it the new alpha word
      if (word != null && alpha.compareToIgnoreCase(word) > 0) {
        alpha = word; 
      }
    }
    
    //close the file 
    file.close(); 

    //return the word that is first alphabetically
    return alpha; 

  }

  /**
  * A program that returns a version of the given array where every instance of the given value is replaced by whichever value to its left or right is larger
  *
  * @param nums The array that is being checked
  * @param value The value that being looked for in the array
  * @return the new array 
  * @author A. Fong
  *
  */

  public static int[] notAlone (int[] nums, int value) {
    
    //calculates the length of the array 
    int length = nums.length; 

    //loops until the end of the array
    for (int i = 0; i < length - 1; i++) {
      
      //checks if the value in the array is the same as the given value
      if (nums[i] == value) { 
        
        //makes sure the element of the array is "alone" (there are values before and after it)
        //also checks that numbers to its left and right are not equal to the current number
        if (i - 1 >= 0 && i + 1 <= nums.length && nums[i - 1] != nums[i] && nums[i + 1] != nums[i]) {

          //if the number before is greater than the value after, it becomes the new value
          if (nums[i - 1] > nums[i + 1]) { 
            nums[i] = nums[i - 1];
          }

          //if the number after is greater than the value before, it becomes the new value
          else if (nums[i - 1] < nums[i + 1]) { 
            nums[i] = nums[i + 1];
          }
        }
      }
    }

    //returns the new array
    return nums; 

  }

  /**
  * A program that returns true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
  *
  * @param nums The array that is being checked
  * @return boolean that tells if the array can be split into two equal sums
  * @author A. Fong
  *
  */

  public static boolean canBalance (int[] nums){ 
    
    //declaring and initializing variables
    int i;
    int sum1 = 0;
    int sum2; 
    int sumTotal = 0; 
    int length = nums.length; 

    //calculates the sum of all the whole array 
    for (i = 0; i < length; i++) { 
      sumTotal += nums[i]; 
    }

    //loops until the end of the array 
    for (i = 0; i < length; i++) { 

      //subtracts the current array value from the total to get sum1 
      //subtracts that sum1 from the total to get sum2
      sum1 += nums[i]; 
      sum2 = sumTotal - sum1; 
      
      //if the first sum equal the second sum, return true
      if (sum1 == sum2) {
        return true;
      }
    }

    //returns false if the sums never equals each other by the end of the loop 
    return false; 

  }

  /**
  * Given a number (n), a two-dimensional array of size (n×n) is created, with a comma between each number:
  * The positions on the minor diagonal receive 1
  * The positions above this diagonal receive 0
  * The positions below the diagonal receive 2
  *
  * @param n The number that determines the size of the array 
  * @author A. Fong
  *
  */

  public static void diagonal (int n) throws IOException {
    
    //printwriter writes to the file 
    PrintWriter outputFile = new PrintWriter(new FileWriter("src/gr11review/part2/diagonalOut.txt"));
    
    //declaring and initializing variables
    int count; 
    int count2; 
    int[][] grid = new int[n][n];

    //loops through the rows of the array
    for (count = 0; count < n; count++) { 
      
      //loops through the columns of the array
      for (count2 = 0; count2 < n; count2++) { 
        
        //set array value to 1 if the sum of the current row and current column equal one less than n
        if (count + count2 == n - 1) {
          grid[count][count2] = 1;
        }
        
        //set array value to 0 if the sum of the current row and current column equal less than n - 1
        else if (count + count2 < n - 1) { 
          grid[count][count2] = 0;
        }

        //set array value to 2 if the sum of the current row and current column equal more than n - 1
        else if (count + count2 > n - 1) { 
          grid[count][count2] = 2;
        }
      }
    }

    //looping to print to the text file 
    //loops through the rows of the array 
    for (count = 0; count < n; count++) {
      
      //loops throught the column of the array 
      for (count2 = 0; count2 < n; count2++) { 
        outputFile.print(grid[count][count2]);

        //if the column is any but the last, print a comma after the number 
        if (count2 != n - 1) {
          outputFile.print(",");
        }
      }

      //after each row is done, go to the next line of the text file
      outputFile.println(""); 
    }

    //close the file 
    outputFile.close(); 

  }

}