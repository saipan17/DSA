import java.util.Scanner;
class fib{

    public static void fibonacci(int a , int b , int no){
     
       if(no==0){
          return;
       }
       
        int c = a+b;
        System.out.println(c);
        fibonacci(b , c , no-1);
          
    }
   public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);
       int no = scanner.nextInt();

       int a = 0;
       int b = 1;

       System.out.println(a);
       System.out.println(b);

       fibonacci(a , b , no-2);
       
   }
}