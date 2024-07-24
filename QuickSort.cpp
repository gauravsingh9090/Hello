#include<iostream>
using namespace std;
int part(int arr[],int low ,int high){
	int pvt = arr[low];
	int l = low+1;
	int r = high;
	 int temp ;
	 
	 do{
	 	while(arr[l]<pvt){
	 		l++;
		 }
		 while(arr[r]>pvt){
		 	r--;
		 }
		 
		 if(l<r){
		 	temp = arr[r];
		 	arr[r] = arr[l];
		 	arr[l]= temp;
		 	
		 }
	 }
	 while(l<r);
	 
	 temp = arr[low];
	 arr[low] = arr[r];
	 arr[r]  = temp;
	 
	 return r;
}
void qs(int arr[], int low,int high){
    if(low<high){
        int pvt = part(arr,low,high);
        qs(arr,0,pvt-1);
        qs(arr,pvt+1,high);
    }
}
void print(int arr[] , int s){
    for(int i=0;i<s;i++){
        cout<<arr[i]<<"\t";
    }
}
int main(){
    int arr[] = {2,4,5,7,8,10,3};
    int s = sizeof(arr)/sizeof(arr[0]);
    print(arr,s);
    qs(arr,0,s-1);
    cout<<"After quick Sort :";
    print(arr,s);
}
