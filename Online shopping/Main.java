#include<iostream>
using namespace std;
int main()
{
  float f,f1,f2,f3,s,s1,s2,s3,a,a1,a2,a3;
  cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  f=f1*(1-f2/100)+f3;
  s=s1*(1-s2/100)+s3;
  a=a1*(1-a2/100)+a3;
  cout<<"In Flipkart Rs."<<f<<"\n";
  cout<<"In Snapdeal Rs."<<s<<"\n";
  cout<<"In Amazon Rs."<<a<<"\n";
  if(f<s&&f<a)
    cout<<"He will prefer Flipkart\n";
  if(s<f&&s<a)
    cout<<"He will prefer Snapdeal\n";
  if(a<f&&a<s)
    cout<<"He will prefer Amazon\n";
}