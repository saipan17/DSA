
class DuplicateString {
    String removeDuplicates(String str) {
        
        String ns = "";
        
        for(int i = 0; i<str.length(); i++){
            
            char ch = str.charAt(i);
            
            
            if(ch != ' '){
                
                ns = ns + ch;
                str = str.replace(ch , ' ');
            }
        }

          return ns;
    }
}
