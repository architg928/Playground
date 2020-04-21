#include<iostream>
main()
{
  float c=0.5;
  int a;
  std::cin>>a;
  for(int i=0;i<a;i++)
  {
    std::cout<<c<<" ";
    c*=3;
  }
} 