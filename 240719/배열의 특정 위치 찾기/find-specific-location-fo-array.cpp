#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int even_sum = 0;
    int sum_3 = 0;
    int input;
    float avg_3;

    for(int i =0; i < 10; i++){
        cin >> input;
        if ((i+1) % 2 == 0) even_sum += input;
        if ((i+1) % 3 == 0) sum_3 += input;
    }
    avg_3 = sum_3 / 3.0;

    cout << fixed;
    cout.precision(1);
    cout << even_sum << " " << avg_3;
    return 0;
}