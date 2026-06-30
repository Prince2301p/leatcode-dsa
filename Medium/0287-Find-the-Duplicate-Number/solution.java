// ═══════════════════════════════════════════════════════
//  Problem  : 0287. Find the Duplicate Number
//  URL      : https://leetcode.com/problems/find-the-duplicate-number/submissions/2051062757/?envType=problem-list-v2&envId=array
//  Difficulty : Medium
//  Language : Java
//  Runtime  : 5 ms
//  Memory   : 82.6 MB
//  Solved   : June 30, 2026
// ═══════════════════════════════════════════════════════

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Find the meeting point
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find the start of the cycle
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}