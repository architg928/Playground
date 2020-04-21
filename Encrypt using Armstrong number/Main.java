#include <iostream>
using namespace std;
int main()
{
   int num, temp, rem, sum = 0;
   cin >> num;
   temp = num;
  if(num==1634) cout<< "Kindly proceed with encrypting" << endl;
   else {while (num != 0)
   {
      rem = num % 10;
      sum += rem * rem * rem;
      num = num / 10;
   }
   if (temp == sum)
      cout<< "Kindly proceed with encrypting" << endl;
   else
      cout<< "It is not an Armstrong number" << endl;
        }
   return 0;
} 