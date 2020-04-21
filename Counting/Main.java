#include <iostream>
#include<cstring>
int main()
{
char a[200];
  
int count= 0, end, i,v=0,c=0,w=0,d=0,s=0;    
std::cin.getline(a,200);
end=strlen(a);
for(i=end-1;i>=0;i--)
{
  if(a[i]=='a'||a[i]=='A'||a[i]=='e'||a[i]=='E'||a[i]=='i'||a[i]=='I'||a[i]=='o'||a[i]=='O'||a[i]=='u'||a[i]=='U')
    v++;
  else if(a[i]>='a'&&a[i]<='z'||a[i]>='A'&&a[i]<='Z') c++;
  else if(a[i]==' ') w++;
  else if(a[i]>='0'&&a[i]<='9') d++;
  else s++;    
}
  std::cout<<"Vowels:"<<v<<"\n"<<"Consonants:"<<c<<"\n"<<"White Spaces:"<<w<<"\n"<<"Digits:"<<d<<"\n"<<"Symbols:"<<s;
  
}