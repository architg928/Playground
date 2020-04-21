#include<iostream>
using namespace std;
#include<cstring>
 main()
{
    int i, j = 0, k = 0;
    char str[200], str1[10][20], word[]="the";
    std::cin.getline(str,200);
    for (i=0; str[i]!='\0'; i++)
    {
	if (str[i]==' ')
	{
	    str1[k][j] = '\0';
	    k++;
	    j=0;
	}
	else
	{
	    str1[k][j]=str[i];
	    j++;
	}
    }
    str1[k][j] = '\0';
    for (i=0; i<k+1; i++)
    {
	if (strcmp(str1[i], word) == 0)
	{
	    for (j=i; j<k+1; j++)
			{
				strcpy(str1[j], str1[j + 1]);
				k--;
			}
	}

    }
   
  
   cout<<"remove occurrence of word from entered string";
}