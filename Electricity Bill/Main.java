#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  if(a<=200)
  { a=a*0.5;
  }
  else if(a<=400)
  { a=a*0.65+100;
  }
  else if(a<=600)
  {
    a=a*0.8+200;
  }
  else if(a>600)
  {
    a=a*1.25+425;
  }
  cout<<"Rs."<<a;
}