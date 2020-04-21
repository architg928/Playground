#include<iostream>
int main()
{
  int a[50],b,c=0;
  std::cin>>b;
  for(int i=0;i<b;i++)
    std::cin>>a[i];
  for(int i=0;i<b;i++)
    if(a[i]>c)
      c=a[i];
  std::cout<<c;
    
}