#include<iostream>
using namespace std;
int main()
{
  int a,e=0,o=0,b=0;
  cin>>a;
  for(;a!=0;)
  {
    b=a%10;
    if(b%2==0)
      e+=b;
    else
      o+=b;
    a/=10;
  } 
  if(o==e)
  cout<<"Yes";
  else cout<<"No";
    
}