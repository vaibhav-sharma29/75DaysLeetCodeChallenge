class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Pehla loop: Ek number uthane ke liye
        for (int i = 0; i < nums.length; i++) {
            
            // Dusra loop: Uske aage wale numbers se check karne ke liye
            for (int j = i + 1; j < nums.length; j++) {
                
                // Agar dono ka sum target ke barabar hai
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        
        // Agar kuch na mile (Question ke hisab se ye line kabhi hit nahi hogi)
        return new int[] {};
    }
}