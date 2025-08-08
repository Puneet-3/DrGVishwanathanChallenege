class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int totalSum = 0;
        for(int num : nums){
            totalSum += num;
        }
        for(int i=0;i<nums.length;i++){
            int right = totalSum - left - nums[i];
            
            if(left == right){
                return i;
            }
            left += nums[i];
        }
        return -1;
        
    }
}