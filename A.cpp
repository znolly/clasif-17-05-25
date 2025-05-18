#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    vector<int> celdas(n);
    for (int i = 0; i < n; ++i){
        cin >> celdas[i];
    }

    sort(celdas.begin(), celdas.end());

    int max_gap = 0;
    for (int i = 0; i < n; ++i){
        int actual = celdas[i];
        int siguiente = celdas[(i + 1) % n];
        int gap = (siguiente - actual + 360) % 360;
        max_gap = max(max_gap, gap);
    }

    int resultado = 360 - max_gap+1;
    cout << resultado << endl;

    return 0;
}