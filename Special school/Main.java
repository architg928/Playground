#include <bits/stdc++.h>
using namespace std;
int main()
{
    string str1;
    string str2;
    cin >> str1 >> str2;
   int le=str1.length();
   int a[20]={0};
  for(int i=0;i<le;i++)
    for(int j=0;j<le;j++)
      if(str2[i]==str1[j]) a[i]=1;
  for(int i=0;i<le;i++)
    if(a[i]!=1)
    { cout<<"It is wrong";
      goto arch;
    }
  cout<<"It is correct";
  arch:;
  
}
      