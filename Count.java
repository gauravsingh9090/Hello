// this is count program  from the check who is grater number 

class Solution {
    public int countOperations(int num1, int num2) {
      int   operations = 0;
     while(num1 !=0 && num2 != 0){
        if(num1>=num2){
            num1 -= num2;
        }
        else{
            num2 -=num1;

        }
        operations++;
     }
     return operations;
    }
public static void main(String args[]){
     countOperations(2,3);
}
