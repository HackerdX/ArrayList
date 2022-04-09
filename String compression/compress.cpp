#include<bits/stdc++.h>
using namespace std;
int main(){
    string s, ans = "";
    cin >> s;
    int count = 1;
    for(int i = 1; i < s.length(); i++){
        if(s[i] == s[i-1]) count++;
        else{
            ans += s[i-1] + to_string(count); 
            count = 1;
        }
    }
    ans += s[s.length()-1] + to_string(count);
    if(s.length() <= ans.length()) cout << s;
    else cout << ans;
    return 0;
}