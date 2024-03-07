class Solution {

  /*
  (int) 'A'
$13 ==> 65

jshell> (int) 'Z'
$14 ==> 90

jshell> (int) 'a'
$15 ==> 97

jshell> (int) 'z'
$16 ==> 122
  */
  public boolean checkIfPangram1(String sentence) {
    // TODO: Write your code here
    int[] checkArray=new int[26];
    int sum=0;
    for(char ch : sentence.toCharArray()){
      int ascii=(int) ch;
      if(ascii >=65 && ascii<= 90 ) checkArray[ascii-65] = 1;
      else if(ascii >=97 && ascii<= 122)  checkArray[ascii-97] = 1;   
    }
    for(int i: checkArray) sum+=i;
    return sum==26;
  }

  /*
  use a hash set
  Time : O(n)
  Space : o(n)
  */
    public boolean checkIfPangram(String sentence) {
      Set<Integer> hSet=new HashSet<>();
      for(char ch : sentence.toCharArray()){
          int ascii=(int) ch;
          if(ascii >=65 && ascii<= 90 )  hSet.add(ascii);
          else if(ascii >=97 && ascii<= 122)   hSet.add(ascii-97+65);
      }
      return hSet.size()==26;
    }
}


/*

Pangram (easy)
Problem Statement
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing English letters (lower or upper-case), return true if sentence is a pangram, or false otherwise.

Note: The given sentence might contain other characters like digits or spaces, your solution should handle these too.

Example 1:

Input: sentence = "TheQuickBrownFoxJumpsOverTheLazyDog"
Output: true
Explanation: The sentence contains at least one occurrence of every letter of the English alphabet either in lower or upper case.
Example 2:

Input: sentence = "This is not a pangram"
Output: false
Explanation: The sentence doesn't contain at least one occurrence of every letter of the English alphabet.

*/
