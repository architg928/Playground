#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
  if(a==2)
    cout<<(b*0.5+b);
  if(a==3)
    cout<<(b*2);
  if(a>3)
    cout<<"Number of items is more";
} 