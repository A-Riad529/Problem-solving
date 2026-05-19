#include<iostream>
using namespace std;
int main (){

int base, val1,val2;
int sum = 0;
cin>>base>>val1>>val2;
for (int i = 1; i <= base; i++)
{
    if (i/10 == 0)
    {
       if(i >= val1 && i <= val2){
        sum += i;
       } 
    }
    else{
        int j = i;
        int mysum = 0;
        while (j != 0)
        {
            int digit = j % 10;
            mysum += digit;
            j /= 10;
        }
        if(mysum >= val1 && mysum <= val2){
            sum += i;
        }
    }
}

cout<<sum;


    return 0;
}