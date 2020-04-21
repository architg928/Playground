#include<iostream>
using namespace std;
int main()
{
  int a,b,c,i;
  cin>>a>>b>>c;
  if((a>b&&a<c)||(a<b&&a>c))
       cout<<"The treasure is in box which has number "<<a<<"\n";
  if((b>a&&b<c)||(b>c&&b<a))
      cout<<"The treasure is in box which has number "<<b<<"\n";
   else
      cout<<"The treasure is in box which has number "<<c<<"\n";
     
     if(a<b&&a<c)
     {
       for(i=a;i>0;i--)
       {
         if(a%i==0&&b%i==0&&c%i==0)
           break;
       }
     } 
      if(b<a&&b<c)
     {
       for(i=b;i>0;i--)
       {
         if(a%i==0&&b%i==0&&c%i==0)
           break;
       }
     } 
      if(c<b&&c<a)
     {
       for(i=c;i>0;i--)
       {
         if(a%i==0&&b%i==0&&c%i==0)
           break;
       }
     } 
     cout<<"The code to open the box is "<<i;
}