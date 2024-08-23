class CountDigit{
    static int evenlyDivides(int N){
          
        int res = 0;
        
        int num = N;
        
        while(N>0){
            
            int rem = N%10;
            
            if(rem != 0 && num%rem == 0){
                
                res++;
            }
            
            N = N/10;
        }
       
       return res;
    }
}