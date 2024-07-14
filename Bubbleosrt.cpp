#include<iostream>
using namespace std;

int main(){
     int arr[] {2,5,75,7,4,7};
int s = sizeof(arr)/sizeof(arr[0]);
     int temp ; int count = 0;
    for(int i=0;i<s;i++){
      cout<<arr[i]<<"\t";
     }
 cout<<"After Apply bouble sort :";
for(int i=0;i<s;i++){
    for(int j=0;j<s-i-1;j++){
        if(arr[j] <arr[j+1]){
           temp = arr[j];
           arr[j] = arr[j+1];
           arr[j+1] = temp;
          count++;
    }
 
}
  if(count == 0){
         cout<<"Data is ALready Shorted";
break;
     }
}
for(int i=0;i<s;i++){
      cout<<arr[i]<<"\t";
     }
}
