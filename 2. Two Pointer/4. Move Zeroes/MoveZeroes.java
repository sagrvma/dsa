class Solution {
    public void moveZeroesTwoTraversals(int[] nums) {
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[idx++] = nums[i];
            }
        }
        for(int i=idx;i<nums.length;i++){
            nums[i] = 0;
        }
    }

    public void moveZeroesOneTraversal(int[] nums) {
        //Swapping in place
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                idx++;
            }
        }
    }
}