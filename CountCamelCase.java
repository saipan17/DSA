import java.util.*;
import java.io.*;

class CountCamelCase{

int countCamelCase (String s)
    {
        
      int res = 0;
      
      for(int i = 0; i<s.length(); i++){
          
          if(Character.isUpperCase(s.charAt(i))){
              
              res++;
          }
      }
        
        
        return res;
    }
}