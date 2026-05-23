#include<iostream>
using namespace std;
struct names{
    string firtsName;
    string lastName;
};

int main(){

names person1;
names person2;
cin>>person1.firtsName>>person1.lastName;
cin>>person2.firtsName>>person2.lastName;
if(person1.lastName == person2.lastName){
    cout<<"ARE Brothers";
}
else{
    cout<<"NOT";
}
    return 0;
}