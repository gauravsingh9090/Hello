#include<iostream>
#include<string>
using namespace std;
int swap( int &x,int &y){
     int z = x;
       x = y;
       y = z;
}
void main(){
      int a=53 , b=23;
     cout<<"Before Swap : a="<<a<<" and  b = "<< b;
     swap(a,b);
      cout<<"After Swap : a="<<a<<" and  b = "<< b;
}
