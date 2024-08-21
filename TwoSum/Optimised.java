class Solution {
  public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer>ans=new HashMap<>();
      for(int i=0; i<nums.length; i++){
          int num=nums[i];
          if(ans.containsKey(target-num)){
              return new int[]{i,ans.get(target-num)};
          }
      ans.put(num,i);
      }
      return null;
  }
}

//Logic: Create a num and iterate to nums.length
//       if map contains target-num then return in new array
//       else add element in map
//Time Complexity:O(n)