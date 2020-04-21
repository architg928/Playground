#include<iostream>
using namespace std;
int main()
{
  int a,o=0,e=0;
  cin>>a;
  int b[a];
  for(int i=0;i<a;i++)
  {
    cin>>b[i];
    if(b[i]%2==0) e+=b[i];
    else o+=b[i];
  }
  cout<<"The sum of the even numbers in the array is "<<e<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<o;
}