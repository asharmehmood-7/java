package org.example.linear_search.problems;

public class SingleNumber {

    public static void main(String[] args) {
        int[] nums ={1,0,1};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {

        int ans =0;
        int second=-1;

        if(nums.length==1){
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++){



            for (int j = i+1; j < nums.length; j++){
                if (nums[j] == nums[i]  ){
                    second=nums[i];
                    break;
                }
                if(second==nums[i]){
                    ans=nums[j];
                }else{ans =  nums[i];}

                if(ans!=second){
                    return ans;
                }

            }
        }
        return  -33341;
    }
}
