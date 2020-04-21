#include <iostream>
using namespace std;
int main()
{
    int n1, n2;
    cin >> n1 >> n2;
   int n3=n1,n4=n2;
    while(n1 != n2)
    {
        if(n1 > n2)
            n1 -= n2;
        else
            n2 -= n1;
    }
    cout << "G.C.D of "<<n3<<" and "<<n4<<" = " << n1;
    return 0;
}
