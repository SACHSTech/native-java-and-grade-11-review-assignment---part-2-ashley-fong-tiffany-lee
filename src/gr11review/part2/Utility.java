package gr11review.part2;
import java.io.*;

public class Utility {

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


}
