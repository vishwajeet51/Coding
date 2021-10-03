#include<iostream>
using namespace std;
int main()
{
    int A[5]={1,2,3,4,5};
    int sum=0;
    for(int i=0;i<5;i++)
    {
        sum=sum+A[i];
    }
    cout<<sum;
    return 0;
}    