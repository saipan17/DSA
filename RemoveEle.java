class RemoveEle {
    int remove_duplicate(int A[],int N){
       
       int i = 0;
       
         for(int j = 1; j<N; j++){
             
             if(A[i] != A[j]){
                 
                 i++;
                 
                 A[i] = A[j];
             }
         }
         
         return i+1;
    }
}