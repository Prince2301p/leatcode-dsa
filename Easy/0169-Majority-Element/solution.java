// ═══════════════════════════════════════════════════════
//  Problem  : 0169. Majority Element
//  URL      : https://leetcode.com/problems/majority-element/submissions/2050026320/
//  Difficulty : Easy
//  Language : Java
//  Runtime  : 1 ms
//  Memory   : 55.9 MB
//  Solved   : June 29, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                candidate= nums[i];
                count=1;

            }
            else if( nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate;

    }
}