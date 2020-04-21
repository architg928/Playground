#include<iostream>
main()
{
  int a,b;
  std::cin>>a;
  b=a;
  for(int i=0;i<4;i++,a++)
  {
    for(int j=0;j<=i;j++)
      std::cout<<a;
      std::cout<<"\n";
   }
  a--;
   for(int i=4;i>0;i--,a--)
  {
    for(int j=0;j<i;j++)
      std::cout<<a;
      std::cout<<"\n";
   } 
}

