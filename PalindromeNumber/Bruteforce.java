class Solution {
  public boolean isPalindrome(int x) {
      int temp=x;
      int r=0;
      int sum=0;
      while(x>0){
          r=x%10;
          sum=(sum*10)+r;
          x=x/10;
      }
      if(temp==sum){
          return true;
      }
      else
      return false;
  }
}

// Reverse the number x
// check if the original number and reverse are equal,if equal return true
// else return false