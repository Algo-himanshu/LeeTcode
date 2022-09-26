class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length,m=0;
        for(int i = 0; i<n;i++){
            if(m<i) return false;
            m=Math.max(m,i+nums[i]);}
        return true;
    }
}