class SelectionSort {

   public static int [] sort(int arr[]){

    int n = arr.length;

    for(int i = 0; i<n; i++){
 
         int smallest = i;

         for(int j = i+1; j<n; j++){
         
         if(arr[smallest] > arr[j]){

         smallest = j;

}

}
  int temp = arr[smallest];
  arr[smallest] = arr[i];
  arr[i] = temp;
    
}

return arr;

} 

public static void main(String[] args){

  int arr[] = {5,4,12,7,9,8,32};

  int newArr [] = new int[arr.length];
  
  newArr = sort(arr);

  for(int res : newArr) {

  System.out.println(res);

}

}
}