#include<iostream>
main()
{
  float c=11;
  int a;
  std::cin>>a;
  for(int i=0;i<a;i++,c+=4)
  {
    std::cout<<c*c<<" "; 
  }
} 