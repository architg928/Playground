#include<iostream>
int main()
{
  int a[50],b,c,i=0;
  std::cin>>b;
  
  for(i=0;i<b;i++)
    std::cin>>a[i];
  
    std::cin>>c;
   
  for(int i=0;i<b;i++)
  {
    if(a[i]==c)
    {
      std::cout<<"She passed her exam";
      goto don;
    }
  } 
  if(i==b) std::cout<<"She failed";
  don:;
}