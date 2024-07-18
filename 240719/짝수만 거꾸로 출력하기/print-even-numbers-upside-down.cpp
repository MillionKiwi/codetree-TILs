#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n, input;

    cin >> n;
    int a[n];
    int cnt = 0;

    for (int i =0; i< n; i++){
        cin >> input;
        if ((input % 2) == 0){
            a[cnt] = input;
            cnt++;
        }
    }
    cnt--;
    for (int i = cnt; i >= 0; i--){
        cout << a[i]<< " ";
    }
    return 0;
}