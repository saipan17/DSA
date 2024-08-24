import java.util.*;
import java.io.*;

class switchCase{
    static double switchCase(int choice, List<Double> arr){
        // code here
        
        switch (choice){
            
            case 1 :
                
                double a = Math.PI*arr.get(0)*arr.get(0);
                return a;
                
            case 2 :
                
                double b = arr.get(0)*arr.get(1);
                return b;
                
            default :
                   return 0;
        }
    }
}