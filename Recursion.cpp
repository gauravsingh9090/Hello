#include<iostream>
using namespace std;
int front(int n){
      if(n==0){
      return 1;
    }
front(n-1);
cout<<n<<"\t";
}
int main(){
   front(5);
}


//////////////////////////////////////////

#include<iostream>
using namespace std;
int front(int n){
      if(n==0){
      return 1;
    }
cout<<n<<"\t"; // tel recursion // 5 4 3 2  1
front(n-1);

}
int main(){
   front(5);
}
