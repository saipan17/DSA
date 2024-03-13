

// User function Template for Java

class ArrayMissing {
    
    int missingNumber(int array[], int n) {
        // Your Code Here
        
         int sum = 0;
        for(int i = 0; i<n-1; i++){
            sum+=array[i];
        }
        int sum2 = (n*(n+1))/2;
        int ans = sum2-sum;
        return ans;
    }
}