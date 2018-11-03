public class findMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mid = 0;  double pre = 0;  int idx1 = 0;  int idx2 = 0;

        if(nums1.length == 0 && nums2.length == 1) return nums2[0];
        if(nums2.length == 0 && nums1.length == 1) return nums1[0];

        for(int i = 0; i<(nums1.length + nums2.length + 3)/2; i++){
            pre = mid;
            if(idx1 == nums1.length) mid = nums2[idx2++];
            else if(idx2 == nums2.length) mid = nums1[idx1++];
            else if(nums1[idx1] <= nums2[idx2]) mid = nums1[idx1++];
            else if(nums1[idx1] > nums2[idx2]) mid = nums2[idx2++];
        }
        return (nums1.length + nums2.length)%2 == 1? pre : (pre + mid)/2;
    }
}
