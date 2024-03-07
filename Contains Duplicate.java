import java.util.HashSet;
import java.util.Set;

public class Solution {

  public boolean containsDuplicate1(int[] nums) {
    // TODO: Write your code here
    /*
    approach : use HashSet to find unique ness;
    Time : O(n)
    Space : O(n)
    Accepted 0.4 ms
    */
    Set<Integer> hSet=new HashSet<>();
    for(int i: nums){
      if(!hSet.add(i)) return true;
    }
    return false;
  }

  /*
  
  Contains Duplicate (easy)
Problem Statement
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums= [1, 2, 3, 4]
Output: false  
Explanation: There are no duplicates in the given array.
Example 2:

Input: nums= [1, 2, 3, 1]
Output: true  
Explanation: '1' is repeating.

  */

  /*
  first sort the array and use two pointers if there are dublicate they will be adjacetn
  Time : O(n) + O(nlog(n)) 
  Space : O(1) 
  Accepted :0.315 ms
  */
  public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    int n=nums.length;
    for(int i=0;i<n-1;i++){
        if(nums[i]==nums[i+1]) return true;
    }
    return false;
    }
}
