class PatternOfString {
    ArrayList<String> pattern(String S) {
        // code here
        
       ArrayList <String> res = new ArrayList<>();
       
       for(int i = S.length(); i>0; i--){
           
           res.add(S.substring(0 , i));
       }
       
       return res;
    }
};