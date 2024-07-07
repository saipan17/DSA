import java.util.Scanner;
class Factorial {

    public static int fact(int no){

       if(no==1 || no == 0){
           return 1;
       }  

       int factorial = fact(no-1);
       int res = no * factorial;
       return res;   

    }

     public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

       int num = scanner.nextInt(); 
       
       int res = fact(num);

       System.out.println(res);
          
     }
}