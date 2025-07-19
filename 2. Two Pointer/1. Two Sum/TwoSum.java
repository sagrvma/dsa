import java.util.*;

class Solution {

    public int[] twoSumBruteForce(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSumTwoPassHashTable(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            int compliment = target-nums[i];
            if(hm.containsKey(compliment) && hm.get(compliment)!=i){//This second condition cant be missed
                return new int[]{i, hm.get(compliment)};
            }
        }
        return new int[]{};
    }

    public int[] twoSumOnePassHashTable(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            int compliment = target-nums[i];
            if(hm.containsKey(compliment)){
               return new int[]{i, hm.get(compliment)}; 
            }
            hm.put(nums[i], i);
        }
        return new int[]{};
    }

    
}