#include <bits/stdc++.h> 
main()
{
  int m,n,req;
  std::cin>>m>>n>>req;
  double result = pow(m,n);
  if(result>=req) std::cout<<"Doctor, you can proceed with your experiment.";
  else std::cout<<"Sorry Doctor! You need more bacteria.";
} 
  