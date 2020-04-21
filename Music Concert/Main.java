#include<iostream>
using namespace std;
int main(){
  int a,o=0,e=0;
  cin>>a;
  int b[a];
  for(int i=0;i<a;i++)
  {
  cin>>b[i];
    if(b[i]%2==0) e++;
    else o++;
  }
    cout<<o<<"\n"<<e;
     return 0;
  
}