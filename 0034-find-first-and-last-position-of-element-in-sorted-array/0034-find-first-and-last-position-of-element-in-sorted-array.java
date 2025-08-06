class Solution {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return new int[]{-1, -1};

        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private int findFirst(int[] nums, int target) {
        int l = 0, u = nums.length - 1;
        int result = -1;
        while (l <= u) {
            int mid = (l + u) / 2;
            if (nums[mid] == target) {
                result = mid;
                u = mid - 1; // search towards left
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                u = mid - 1;
            }
        }
        return result;
    }

    private int findLast(int[] nums, int target) {
        int l = 0, u = nums.length - 1;
        int result = -1;
        while (l <= u) {
            int mid = (l + u) / 2;
            if (nums[mid] == target) {
                result = mid;
                l = mid + 1; // search towards right
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                u = mid - 1;
            }
        }
        return result;
    }
}
