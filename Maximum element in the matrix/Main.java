#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int a[50][50],co=0;
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
      if(a[i][j]>co) co=a[i][j];
    }
  cout<<"The maximum element is "<<co;
}