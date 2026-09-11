//Carson Kim 9/10/26
//This code scans through the text and finds all the small letters surrounded by exactly three big letters

          // Import the Scanner class to read text files
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stuff {
     public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.pythonchallenge.com/pc/def/linkedlist.php?nothing=12345");
         BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
         String line = reader.readLine();
         


         Pattern pat = Pattern.compile("[\\d]+"); // step 1 compile your pattern
             Matcher mat = pat.matcher(line); //step 2 set up your matcher
             while(mat.find()) {//step 3 look through until you find a match
                  line = mat.group();
                  url= new URL("https://www.pythonchallenge.com/pc/def/linkedlist.php?nothing="+line);
                  reader = new BufferedReader(new InputStreamReader(url.openStream()));
                  line = reader.readLine();
                  System.out.println(line);
                  mat = pat.matcher(line);
             }
       }
}
     