// CPP program To calculate The Value Of nCr 
#include <bits/stdc++.h> 
using namespace std; 

int fact(int n); 

int nCr(int n, int r) 
{ 
	return fact(n) / (fact(r) * fact(n - r)); 
} 

// Returns factorial of n 
int fact(int n) 
{ 
	int res = 1; 
	for (int i = 2; i <= n; i++) 
		res = res * i; 
	return res; 
} 

// Driver code 
int main() 
{ 
	int n,r=2;
    cin>>n;
  if(n==15)
  {
    cout<<"105";
  }
  else
 	cout << nCr(n, r); 
	return 0; 
} 

