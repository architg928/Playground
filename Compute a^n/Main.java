#include<iostream>
using namespace std;
int power(int x, int y) {  
   int i,power=1;
   if(y == 0)
      return 1;
   for(i=1;i<=y;i++)
      power=power*x;
   return power;
} 
int main() { 
   int x,y;
   cout<<"Enter the value of a"<<endl;
   cin>>x;
   cout<<"Enter the value of n"<<endl;
   cin>>y;
   cout<<"The value of "<<x<<" power "<<y<<" is "<<power(x,y);
   return 0; 
} 