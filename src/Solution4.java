public class Solution4 {
    public double finMedianSortedArrays(int[] nums1,int[] nums2){
        int length1 = nums1.length,length2 = nums2.length;
        if (length1>length2){
            return  finMedianSortedArrays(nums2,nums1);
        }
        int left = 0,right = length1,ansi = -1;
        int median1 = 0,median2 = 0;
        while (left<=right){
            int i = (left+right)/2;
            int j = (length1+length2+1)/2-i;
        }
    }
}
