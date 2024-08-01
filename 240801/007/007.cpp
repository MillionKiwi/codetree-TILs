#include <iostream>
#include <string>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    class Secret {
    public:
        string c;
        char p;
        int t;

        Secret(string c, char p, int t) {
            this->c = c;
            this->p = p;
            this->t = t;
        }
    };
    string c;
    char p;
    int t;
    cin >> c;
    cin >> p; 
    cin >> t;

    Secret s = Secret(c,p,t);

    cout << "secret code : " << s.c <<endl;
    cout << "meeting point : " << s.p << endl;
    cout << "time : " << s.t << endl;

    return 0;
}