#include<iostream>
main()
{
  int c=6;
  int a,b=5;
  std::cin>>a;
  for(int i=0;i<a;i++,b+=5)
  {
    std::cout<<c<<" ";
    c+=b;
  }
} 