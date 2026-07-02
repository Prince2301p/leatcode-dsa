// ═══════════════════════════════════════════════════════
//  Problem  : 0389. Find the Difference
//  URL      : https://leetcode.com/problems/find-the-difference/submissions/2053332465/?envType=problem-list-v2&envId=string
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 3 ms
//  Memory   : 43.4 MB
//  Solved   : July 2, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public char findTheDifference(String s, String t) {
        int count []= new int [26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            int idx=t.charAt(i)-'a';
            count[idx]--;

        
        if(count[idx]<0){
            return t.charAt(i);
         }
        }
        return ' ';
    }
}