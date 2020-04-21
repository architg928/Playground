#include <bits/stdc++.h>
using namespace std;
int main()
{
  string str1;
  string str2;
  cin >> str1;
  int le=str1.length();
  for(int i=0,j=0;i<le;i++)
  {
    if(str1[i]>='A'&&str1[i]<='Z'||str1[i]>='a'&&str1[i]<='z')
    {
      str2[j]=str1[i];
      j++;
    } 
  }
  for(int i=0;str2[i]!=0;i++)
    cout<<str2[i];
} 
  
  