// ═══════════════════════════════════════════════════════
//  Problem  : 0415. Add Strings
//  URL      : https://leetcode.com/problems/add-strings/?envType=problem-list-v2&envId=string
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 0 ms
//  Memory   : 42.9 MB
//  Solved   : July 2, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public String addStrings(String num1, String num2) {
        Long a=Long.parseLong(num1);
        Long b=Long.parseLong(num2);
        Long c=a+b;
        return String.valueOf(c);
    }
}