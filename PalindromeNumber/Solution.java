class Solution {
  public boolean isPalindrome(int x) {
      String s=String.valueOf(x);
      int n=s.length();

      for(int i=0; i<n/2; i++){
          if(s.charAt(i)!=s.charAt(n-i-1))return false;
      }
      return true;
  }
}

// convert the int to String 
// starts the loop and go upto the half of the length
// check if any character gets unequal from n-i-1 return false
// return true