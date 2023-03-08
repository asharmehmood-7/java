package org.example.basics;

public class RemoveDuplicatesFromSortedArray {
//    Input: nums = [0,0,1,1,1,2,2,3,3,4]
//    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//    Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//    It does not matter what you leave beyond the returned k (hence they are underscores).

//    test case
//    int[] nums = [...]; // Input array
//    int[] expectedNums = [...]; // The expected answer with correct length
//
//    int k = removeDuplicates(nums); // Calls your implementation
//
//assert k == expectedNums.length;
//for (int i = 0; i < k; i++) {
//        assert nums[i] == expectedNums[i];
//    }

    public static   void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4,6,7,7,7,8};
        int result;
        removeDuplicates(nums);
    }
    public static void removeDuplicates(int[] nums) {
        int flag=0;
        for (int i=0;i<nums.length;i++) {
//            System.out.println(nums[i]);
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        System.out.println("same"+nums[i]);
//                        for(int k=j+1;k<nums.length;k++){
//                            flag=nums[j];
//                            nums[j]=nums[k];
//
//                        }
                        //nums[nums.length-1]=flag;
                    }
                }

        }
     //   System.out.println(nums);
        // Using a for loop to iterate through the elements of the array
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }

    }
}











