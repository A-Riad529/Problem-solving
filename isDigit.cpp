#include<iostream>
#include<cctype>
using namespace std;
int main(){

char check;
cin>>check;
int i = static_cast<int>(check);
char upCase = (char)toupper(check);
if('0' < i && i < '9'){

    cout<<"IS DIGIT";
}
else{
    cout<<"ALPHA"<<"\n";
    if(upCase == check){
        cout<<"IS CAPITAL";
    }
    else{
        cout<<"IS SMALL";
    }
}

    return 0;
}