#include<iostream>
using namespace std;
int main()
{
  int a;
  int t;
  cin>>a>>t;
  if(a>13)
  { if(t==13)
  {
    cout<<"$5.00";
  }
   else
     cout<<"$8.00";
  }
  else if(t==13)
    cout<<"$2.00";
   else
     cout<<"$4.00"; 
}