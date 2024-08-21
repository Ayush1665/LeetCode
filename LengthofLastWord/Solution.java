class Solution {
  public int lengthOfLastWord(String s) {
      s=s.trim();
      int length=0;
      for(int i=s.length()-1; i>=0; i--){
          if(s.charAt(i)!=' '){
              length++;
          }
          else{
              break;
          }
      }
      return length;
  }
}

// trim the string s so that whitespaces can be removed
// start the loop from the last index and check if charAt(i) not contains ' ' length++;
// else break the loop
// return the length