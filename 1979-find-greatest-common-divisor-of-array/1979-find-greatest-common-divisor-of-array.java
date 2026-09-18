class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0];
        int max=nums[0];

        for(int num:nums){
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        return findGcd(min,max);
    }
    static int findGcd(int a , int b){
        while(b!=0){
            int temp=a%b;
            
            a=b;
            b=temp;
        }
        return a;
    }
}