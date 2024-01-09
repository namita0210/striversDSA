
package arrayQuestions;
import java.util.Arrays;
public class q2 {

    // Brute Force
    public static int search(int[] nums , int target){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while(left<= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]> target){
                right = mid -1;
            }
            if(nums[mid]<target){
                left = mid + 1;
            }
        }
        return -1;
    }

    //Optimal
    public static int optimalSearch(int[]arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + ( right - left)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[left] <= arr[mid]){ //left side is sorted
                if(arr[left]<=target && target<=arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{ //right side is sorted
                if(arr[mid]>= target && target>= arr[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }

    //Main method
    public static void main(String[]args){
        int [] arr = {4,5,6,7,0,1,2};
        int ans = optimalSearch(arr, 0);
        System.out.println(ans);
    }

    
}
