class Solution {

  /*
  brute force 
  Time : O(n^2)
  Space : O(1)
  */
  public static int[] search1(int[] arr, int targetSum) {
    // TODO: Write your code here
    int n=arr.length;
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
         if((arr[i] + arr[j] ==targetSum) && i!=j) return new int[]{i,j};
      }
    }
    return new int[] { -1, -1 };
  }

  /*
   using extra memory we can find the target-curr in hash map containing the 
   length index and return accordingly
   Time : O(n)
   Space :O(n)
  */
    public static int[] search2(int[] arr, int targetSum) {
          int n=arr.length;
          Map<Integer,Integer> hMap =new HashMap<>();
          for(int i=0;i<n;i++){
             hMap.put(arr[i],i);
          }
        for(int i=0;i<n;i++){
            int reqKey=targetSum-arr[i];
            if(hMap.containsKey(reqKey) && hMap.get(reqKey)!=i)
               return new int[]{hMap.get(reqKey),i};
        }
        return new int[] { -1, -1 };

    }
    /*
    using two pointer since the array is sorted we can , do this without extra Space
    Time: O(n)
    Space : O(1)
    */
   public static int[] search(int[] arr, int targetSum) {
          int i=0,j=arr.length-1;

          while(i<j){
            int currSum=arr[i]+arr[j];

            if(currSum==targetSum) return new int[]{i,j};
            else if(currSum>targetSum) j--;
            else i++;
          }
          return new int[]{-1,-1};
        }
}

/*
Pair with Target Sum (easy)
Problem Statement
Given an array of numbers sorted in ascending order and a target sum, find a pair in the array whose sum is equal to the given target.

Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target. If no such pair exists return [-1, -1].

Example 1:

Input: [1, 2, 3, 4, 6], target=6
Output: [1, 3]
Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6
Example 2:

Input: [2, 5, 9, 11], target=11
Output: [0, 2]
Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11

*/
