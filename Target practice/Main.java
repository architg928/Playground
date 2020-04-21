#include<iostream>
using namespace std;
int main()
{
  int a,b,c=0,i;
  cin>>a;
  for(i=1;1;i++)
  {
    cin>>b;
    c+=b;
    if(c>=a)
    {
      cout<<"The number of turns is "<<i;
      break;
    } 
   }
}  