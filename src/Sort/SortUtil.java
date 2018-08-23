package Sort;

import java.util.Arrays;

public class SortUtil {

    // 冒泡
    public static void maopaoSort(int [] nums){
        int t;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i +1; j < nums.length; j++) {
                System.out.println("比较值是：---" + nums[i]);
                if(nums[i] > nums[j]){
                    t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
            show(nums);
        }
    }
    public static void show(int [] nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int [] nums,int left,int right){
        if(left > right){
            return;
        }
        int k = nums[left];
        int i=left ,j = right,t;
        while(i<j){
            while (i<j && nums[i]<k){
                i++;
            }
            while (i<j && nums[j]>k){
                j--;
            }
            if(i<j){
                t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
            }
        }
        show(nums);
        quickSort(nums,left,i-1);
        quickSort(nums,i+1,right);
    }


    public static void mergeSort(int [] nums,int left ,int right){
        if(left < right){
            int mid = (left + right) /2;
            mergeSort(nums,left,mid);
            mergeSort(nums,mid+1 ,right);
            merge(nums,left,mid,right);
        }
    }

    private static void merge(int[] nums, int left,int mid, int right) {
        int l = left,r = mid+1;
        int [] temp = new int[right - left + 1];
        int k =0;
        while(l<=mid && r <= right){
            if(nums[l] < nums[r]){
                temp[k++] = nums[l++];
            }else{
                temp[k++] = nums[r++];
            }
        }
        while(l <= mid){
            temp[k++] = nums[l++];
        }
        while (r <= right){
            temp[k++] = nums[r++];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[left+i] = temp[i];
        }

        show(nums);
    }

    public static void main(String[] args) {
        int [] nums = {5,8,1,0,6,9,3,4,7,2};
        mergeSort(nums,0,9);
    }
}
