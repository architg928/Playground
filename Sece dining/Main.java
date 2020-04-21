#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  string c;
  int a;
  cin>>c>>a;
  if(c=="front")
  {
    if(a==1) cout<<"Left Handed";
    else cout<<"Right Handed";
  }
  if(c=="rear")
  {
    if(a==1) cout<<"Right Handed";
    else cout<<"Left Handed";
  } 
} 