#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int x[r][c],y[r][c];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>x[i][j];
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>y[i][j];
  for(int i=0;i<r;i++)
  {for(int j=0;j<c;j++)
    { x[i][j]+=y[i][j];
     cout<<x[i][j]<<" ";
    }
   cout<<"\n";}
}