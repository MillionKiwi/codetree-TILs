#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int cnt = 0;
    int sum = 0;
    int input;

    for(int i = 0; i < 10; i++){
        cin >> input;
        if (input == 0) break;
        if (input % 2 ==0) {
            sum += input;
            cnt++;
        }
    }
    cout << cnt << " " << sum;
    return 0;
}