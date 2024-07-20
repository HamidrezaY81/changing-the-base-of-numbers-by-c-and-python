#include <iostream>
using namespace std;
int main()
{
    int a, b, c;
    string s = "";
    cin >> a >> b;

    while (a != 0)
    {
        c = a % 10;

        if (c <= 9)
            s += char(c + 48);

        else
            s += char(c + 55);

        a /= b;
    }

    for (int i = s.length() - 1; i >= 0; i++)
    {
        cout << s[i];
    }
}