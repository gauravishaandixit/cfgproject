import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchInArray {

    public static void main(String []args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter Space Separated Integers:: ");
        String[] strs = br.readLine().split(" ");
        int[] nums = new int[strs.length];

        for(int i = 0; i < strs.length; i++)
            nums[i] = Integer.parseInt(strs[i]);

        System.out.print("Enter Target:: ");
        int target = Integer.parseInt(br.readLine());

        System.out.println(new SearchInArray().search(nums, target));

    }

    boolean search(int[] nums, int target)
    {
        int start = 0, end = nums.length - 1, mid = -1;
        while(start <= end)
        {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < nums[end] || nums[mid] < nums[start])
            {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else if (nums[mid] > nums[start] || nums[mid] > nums[end])
            {
                if (target < nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                end--;
            }
        }
        return false;

    }
}
