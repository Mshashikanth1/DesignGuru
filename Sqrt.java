class Solution {

  /*
  using in build square root functions
  */
  public int mySqrt1(int x) {
    // TODO: Write your code here
    return (int) Math.sqrt(x);
  }
    public int mySqrt2(int x) {
    // TODO: Write your code here
    return (int) Math.pow(x,0.5);
  }


  /*
  we can use binary search to find the number in an iterval; 
  the interval is 1,x sqrt(x) lies in between them

  Time : O(log(n))
  Space : O(1)
  */

  public int mySqrt(int x) {
    if (x < 2) return x; // return x if it is 0 or 1

    int left = 2, right = x / 2; // initialize left and right pointers
    int pivot;
    long num; // use long to store result of pivot * pivot to prevent overflow
    while (left <= right) { // binary search for the square root
      pivot = left + (right - left) / 2; // find the middle element
      num = (long) pivot * pivot;
      if (num > x) right = pivot - 1; // if pivot * pivot is greater than x, set right to pivot - 1
      else if (num < x) left = pivot + 1; // if pivot * pivot is less than x, set left to pivot + 1
      else return pivot; // if pivot * pivot is equal to x, return pivot
    }
    return right; // return right after the loop
  }
}

 
 /*
 Sqrt (medium)
Problem Statement
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.8284, and since we need to return the floor of the square root (integer), hence we returned 2.  
Example 2:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2.
Example 3:

Input: x = 2
Output: 1
Explanation: The square root of 2 is 1.414, and since we need to return the floor of the square root (integer), hence we returned 1.  
 
 */
