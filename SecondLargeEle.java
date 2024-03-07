class SecondLargeEle {
    int print2largest(int arr[], int n) {
       
       
        Arrays.sort(arr);
        
        int last = arr[n-1];
        
        for(int i = n-1; i>=0; i--){
            
            if(arr[i] != last){
                
                return arr[i];
            }
        }
        
        return -1;
    }
}