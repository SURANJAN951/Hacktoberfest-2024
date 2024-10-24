import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Function to find two indices that add up to the target sum
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // To store the difference and index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Calculate the complement
            if (map.containsKey(complement)) {
                // If complement is found in the map, return the indices
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i); // Store the number and its index in the map
        }
        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Example array
        int target = 9; // Example target

        try {
            int[] result = findTwoSum(nums, target);
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
