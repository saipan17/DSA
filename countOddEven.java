class countOddEven {
 
    public int[] countOddEvenn(int arr[] , int n){

      int arr1[] = new int[2];

      int odd = 0;
      int even = 0;
     

     for(int i = 0; i<n; i++){

        if(arr[i] % 2 == 0){

           even++;
      }
       
     else{

       odd++;

     }

    }

    arr1[0] = odd;
    arr1[1] = even;

   return arr1;

}
}