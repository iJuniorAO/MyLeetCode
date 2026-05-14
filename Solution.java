public class Solution {

    public int[] twoSum(int[] nums, int target){

        for (int i = 0; i < nums.length-1; i++) {

            for (int j = nums.length-1; j > 0; j--){
                if (i==j) {
                    continue;
                }
                if (nums[i]+nums[j] == target){
                    return new int[] {i,j};
                }
            }   
        }
        return new int[] {};
    }
    

    public int[] plusOne(int[] digits) {

        int pointer1 = digits.length-1;
        int pointer2 = pointer1;

        int[] newDigits = new int[pointer2+=2];


        while (digits[pointer1]==9) {
            digits[pointer1]=0;

            if (pointer1==0){
                newDigits[pointer1] = 1;
                continue;
            }
            pointer1--;
        }

        if (newDigits[0] == 1){
            return newDigits;
        }

        digits[pointer1]++;
        return digits;
    }


}
