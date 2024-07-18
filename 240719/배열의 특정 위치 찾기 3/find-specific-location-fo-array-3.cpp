#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n = 0;
    int input;
    int sum = 0;
    int a[100];

    for(int i = 0; i < 100; i++){
        cin >> input;
        if (input == 0) break;
        a[i] = input;
        n++;
    }
    n--;
    sum = a[n] + a[n-1] + a[n-2];
    cout << sum;
    return 0;
}