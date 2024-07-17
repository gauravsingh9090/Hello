// Finally => The finally keyword is used to execute code (used with exceptions - try..catch statements) no matter if there is an exception or not.


public class Main {

     public static void main(String args[]){
     
      try{
          int  arr[] = {2,4,6};
           System.out.println("This is a digit: "+arr[1]);
      }
    catch(Exception e){
        System.out.println("Please Enter Valid response ");
    }
    finally{
        System.out.println("Both are Try and Catch are completed ");
     }

}
}
