#include<iostream>
main()
{
  int a;
  std::cin>>a;
  for(int i=1;i<=a;i++)
  {
    if(i%2!=0)
      std::cout<<i*i-1<<" ";
    else
      std::cout<<i*i-2<<" ";
  }
} 