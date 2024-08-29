class Solution {
    int isPerfect(int N) {
        // code here
        
        int temp = N;
        int sum = 0;
        
        while(temp!=0){
            
            int fact = 1;
            int rem = temp%10;
            
            for(int i = 1; i<=rem; i++){
                
                fact = fact*i;
            }
            
            temp/=10;
            sum+=fact;
            
        }
        
        if(N==sum){
            
            return 1;
        }else{
            
            return 0;
        }
    }
}