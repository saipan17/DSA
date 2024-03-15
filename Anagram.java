
import java.util.*;
import java.util.stream.*; 
import java.lang.*;
import java.io.*;

class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
         boolean flag = true;
         
         if(a.length() != b.length()){
             
             flag = false;
         }
         
        char [] a_arr = a.toCharArray();
        
        char [] b_arr = b.toCharArray();
        
        Arrays.sort(a_arr);
        Arrays.sort(b_arr);
        
        
        if(!Arrays.equals(a_arr ,  b_arr)){
            
            flag = false;
        }
        
        return flag;
    }
}