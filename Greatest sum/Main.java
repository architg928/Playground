#include<iostream>
using namespace std;
int main()
{
  int r,c,p;
  cin>>r>>c;
  p=c;
  int a[r][c],count[20]={0},cnt1=0,cnt2;
  for(int i=0;i<r;i++)
    for(int j=0;j<c;j++)
      cin>>a[i][j];
  for(int j=0;j<c;j++)
    for(int i=0;i<r;i++)
        count[i]+=a[i][j];
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++)
  cout<<count[i]<<" ";
  for(int i=0;i<c;i++)
  {
    if(cnt1<count[i])
       {
         cnt1=count[i];
         cnt2=i;
       }} 
       cout<<"\nRow "<<cnt2+1<<" has maximum sum\n";
  int cnt[20]={0};
  for(int i=0;i<r;i++)
    for(int j=0;j<p;j++)
        cnt[i]+=a[j][i];
  cout<<"Sum of columns is ";
  for(int i=0;i<p;i++)
   cout<<cnt[i]<<" ";

int polo=0;
for(int m=0;m<c;m++)
  {
    if(polo<cnt[m])
       {
         polo=cnt[m];
         cnt2=m;
       }} 
cout<<"\nColumn "<<cnt2+1<<" has maximum sum\n";
} 