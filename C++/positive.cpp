#include<iostream>
using namespace std;
int main()
{
	int number;
	cout << "enter a number:";
	cin >> number;
	number < 0 ? cout << number * - 1 : cout << number;
}

