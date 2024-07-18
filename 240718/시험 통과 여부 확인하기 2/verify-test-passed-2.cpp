#include <iostream>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    int n, input;
    int pass_num = 0;
    cin >> n;

    for(int i=0; i < n; i++){
        bool passed = 0;
        float avg;
        int sum = 0;

        for(int j = 0; j < 4; j++){
            cin >> input;
            sum += input;
        }

        avg = (float)sum / 4.0;

        if (avg >= 60.0) {
            passed = 1;
            pass_num++;
        }
        if (passed == 1) cout << "pass" << endl;
        else cout << "fail" << endl;
    }
    cout << pass_num;
    
    return 0;
}