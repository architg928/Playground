#include <iostream>
int fib(int n)
{
	if (n <= 1)
		return n;
	return fib(n - 1) + fib(n - 2);
}
int main()
{
	int n;
    std::cin>>n;
	printf("%d", fib(n-1));
    return 0;
}