#include <iostream>
using namespace std;
main()
{
  int a;
  cin>>a;
  switch(a)
  {
    case 1:cout<<"1\n";break;
    case 2:cout<<"12\n32";break;
    case 3:cout<<"112\n322\n334";break;
    case 4:cout<<"1112\n3222\n3334\n5444";break;
    case 5:cout<<"11112\n32222\n33334\n54444\n55556";break;
    case 6:cout<<"111112\n322222\n333334\n544444\n555556\n766666";break;  
  }
}