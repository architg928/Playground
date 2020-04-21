#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  
  int a[r][c],count[20]={0};//init
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  
 for(int j=0;j<c;j++)//comp
    for(int i=0;i<r;i++)
        count[i]+=a[i][j];
  
  for(int i=0;i<r;i++)//print
  cout<<count[i]<<"\n";
}