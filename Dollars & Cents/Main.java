#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f;
  cin>>a>>b>>c>>d;
  e=a+c+((b+d)/100);
  cout<<e<<"\n";
  f=(b+d)%100;
  cout<<f<<"\n";
}  