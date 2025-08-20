public class Demo {
    public static void main(String[] args) {

        int nums[] = {5,7,9,11,13};
        //int nums[] = new int[1000];
        int target = 5;
        
        int result = binarySearchRecursive(nums,target, 0, nums.length-1  );

        if(result !=-1)
            System.out.println("Element found at Index : "+ result);
        else
            System.out.println("Element not found!");

    }

    public static int linearSearch(int[] nums, int target) {
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right){
            int mid = (left) + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] nums, int target, int left, int right) {
        if(left<=right){
            int mid = (left)+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid] < target){
                return binarySearchRecursive(nums,target,mid+1,right);
            }
            else {
                return binarySearchRecursive(nums,target, left, mid-1);
            }
        }

        return -1;
    }
}
