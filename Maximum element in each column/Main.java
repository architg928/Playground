#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[r][c],count[20]={0};
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  for(int j=0;j<c;j++)
    for(int i=0;i<r;i++)
      if(a[i][j]>count[j])
        count[j]=a[i][j];
  for(int i=0;i<c;i++)
  cout<<count[i]<<"\n";
}