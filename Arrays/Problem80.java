class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int n = nums.length;
        if(n==0)return 0;
        int count = 1;
        for(int i = 1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count = 1;
            }
        if(count<=2){
            nums[k]=nums[i];
            k++;
        }
    }
     return k;
    }
}