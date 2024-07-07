class Recursion {

      public static void printNumber(int i , int n , int sum){

        if(i==n){

            sum = sum+i;
            System.out.println(sum);
            return;
        }

        sum+=i;
        printNumber(i+1 , n , sum);
         
      }
      
      public static void main(String[] args){

          printNumber(1 , 10 , 0);
      }
}