#include<iostream>
using namespace std;
int main()
{
  int a,b,c[10],d=0;
  cin>>a>>b;
  for(int i=0;i<2;i++)
  { cin>>c[i];
   d+=c[i];
  }

  if(a>=d) cout<<"YES";
  else cout<<"NO";
}