class Solution {
    public int removeDuplicates(int[] nums) {
        int idx = 1;//index of next nonduplicate element to be
        for(int i=1;i<nums.length;i++){//skipping first element as obvious
            if(nums[i]!=nums[idx-1]){
                nums[idx++] = nums[i];
            }
        }
        return idx;
    }
}