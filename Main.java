import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        // int [] n1 = {-1,-2,-3,-4,-5};
        // int t1 = -8;

        int[] resp;

        // resp = solution.twoSum(n1, t1);
        // System.out.println(Arrays.toString(resp));

        int[] n2 = {9,9,9,9};
        resp = solution.plusOne(n2);

        System.out.println(Arrays.toString(resp));
        
    }
    
}
