#include<iostream>
using namespace std;
int main(){

int num;
int count = 1;
cin>>num;
for (int i = 0; i < num; i++)
{
    cout<<count++<<" "<<count++<<" "<<count++<<" ";
    if(count % 4 == 0){
        cout<<"PUM"<<"\n";
        count++;
    }
}

    return 0;
}