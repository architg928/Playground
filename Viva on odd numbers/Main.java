#include<iostream>

main()
{
   int n,count=0;
   float score=0.0f;
  
   do
   {
      scanf("%d",&n);
      if (n<0)
          score=score-1.0;
      else if(n%2==1)
      {
            count++;
            score++;
       }
    else
           score=score-0.5;
  }
  while(n>0&&count!=3);
    std::cout<<score;
  
}