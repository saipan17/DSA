
class Leaders{
    //Function to find the leaders in the array.

    static ArrayList<Integer> leaders(int arr[], int n){
       
          ArrayList<Integer> ans = new ArrayList<>();
          
          int a = arr[n-1];
          
          ans.add(a);
          
          for(int i = n-2; i>=0; i--){
              
              if(arr[i]>=a){
                  
                  ans.add(0 , arr[i]);
                  
                  a = arr[i];
              }
          }
          
          return ans;
    }
}
