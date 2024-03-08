class ReverseString 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        
         String [] arr = S.split("[.]");
         
         Collections.reverse(Arrays.asList(arr));
         
         String str = String.join("." , arr);
         
         return str;
    }
}