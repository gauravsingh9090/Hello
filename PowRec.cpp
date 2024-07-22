// Power Program with Recursion
#include<iostream>
using namespace std;
int pow(int b,int p){
    if(p==0)
       return 1;
    if(b==0)
        return 0;
    int j = b*pow(b,p-1);
    return j;
}
int main(){
    int a,b;
    cout<<"Enter Base = ";
    cin>>a;
    cout<<"Enter Power = ";
    cin>>b;
    cout<<"Result = "<<pow(a,b);
}
