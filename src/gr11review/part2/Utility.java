package gr11review.part2;
import java.io.*;
import gr11review.part2.Utility.*;

public class Utility {

  /**
   * A program that returns the sum of the numbers appearing in a string, ignoring all other characters
   *
   * @param userInput the string that is checked 
   * @return sum of numbers in userInput
   * @author A. Fong
   *
   */
  
  public static int sumNumbers (String userInput){ 
    
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
   * A program that returns the sum of the numbers appearing in a string, ignoring all other characters
   *
   * @param userInput the string that is checked 
   * @return sum of numbers in userInput
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

  

}