#include<iostream>
using namespace std;
int main()
{
  int ne,o=0,e=0;
  cout<<"Enter the number of elements in the array\n";
 cin>>ne;
  int arr[ne];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<ne;i++)
  {
    cin>>arr[i];
    if(arr[i]%2==0)
    e++;
    else o++;
  }
  if(o==0&&e!=0) cout<<"The array is Even";
 else if(e==0&&o!=0) cout<<"The array is Odd";
  else cout<<"The array is Mixed";
}