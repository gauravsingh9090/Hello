// factorial program 
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    public static int factorial(int n) {
        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case
        return n * factorial(n - 1);
    }
}

////////////////////////////////////////////
class Main{
     public static void main(String args[]){
         int n=5 ;
         System.out.println(fact(n));
         
     }
     public static int fact(int n){
         int res =1;
         for(int i=2;i<=n;i++){
             if(n==1|| n==0){
                 return 1;
             }
             else {
                 res = res*i;
             }
         }
         return res;
     }
}
