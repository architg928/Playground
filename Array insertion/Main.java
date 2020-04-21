#include<iostream>
using namespace std;
int main()
{ int a,c,d;
 cout<<"Enter the number of elements in the array\n";
 cin>>a;
 int b[a],x[a+1];
 cout<<"Enter the elements in the array\n";
 for(int i;i<a;i++)
 {
 cin>>b[i];
 }
 cout<<"Enter the location where you wish to insert an element\n";
 cin>>c;
if(c<=a){ cout<<"Enter the value to insert\n";
 cin>>d;
  for(int i=0,j=0;j<=a;j++)
    {
       if(j==c-1)
       {
           x[j]=d;
       }
       else
       {
           x[j]=b[i];
           i++;
       }
    }
 cout<<"Array after insertion is\n";
    for(int i=0;i<=a;i++)
    cout<<x[i]<<"\n";
        }
 else cout<<"Invalid Input";
}
