package gr11review.part2;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;



public class Utility {

//Method 1
public static String zipZap(String str){
  
 String output = ""; 

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

//FileIO 1
public static String longestWord(String filenametxt) throws IOException {

  BufferedReader key = new BufferedReader(new FileReader(filenametxt));

  String longest = ""; 
  String current = key.readLine(); 

  while(current != null){
    if(current.length() >= longest.length()){
      longest = current; 
    }
    current = key.readLine(); 
  }

  key.close();
  return longest;

}


}
