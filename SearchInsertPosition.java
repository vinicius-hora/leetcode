/*
https://leetcode.com/problems/search-insert-position/description/

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/


public class SearchInsertPosition {

    public static void main(String[] args) {

        // int[] nums = {1,3,5,6};
        // int target = 5;

        int[] nums = {1,3,5,6};
        int target = 2;

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int result = searchInsertPosition.searchInsert(nums, target);
        System.out.println("resultado: " + result);

    }

    public int searchInsert(int[] nums, int target) {
        int i = 0;

        for(i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
            if(nums[i] > target){
                return i;
            }
            if(i == nums.length - 1){
                return i + 1;
            }
        }

        return 0;
        
    }
    
}
