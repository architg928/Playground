#include<iostream>
using namespace std;
int main()
{
float x,y,z,t,nb;
  int sc,b;
  cin>>nb>>t>>sc>>b;
  cout<<nb/6<<"\n";
  x=b/6+(b%6)*0.1;
  cout<<x<<"\n";
  y=sc/x;
  printf("%.1f\n", y);
  z=t/(nb/6);
  printf("%.1f\n", z);
  if(y>z) cout<<"Eligible to Win";
  else cout<<"Not Eligible to Win";
}