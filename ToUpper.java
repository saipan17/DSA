import java.util.*;
import java.io.*;

class Solution
{
    public String transform(String s)
    {
        // code here
     
     String[] words = s.split(" ");
     String result = "";
     
     for(String word : words){
         
         if(word.length() > 0){
             
             result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
         }
     }
     
       return result.trim();
     
    }
}