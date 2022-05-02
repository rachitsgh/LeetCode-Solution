class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                swap(nums ,i,k);
                k++;
            }
        }
        
    }
    void swap(int[] arr,int f,int l){
        int temp = arr[f];
        arr[f] = arr [l];
        arr[l] = temp;
    }
}