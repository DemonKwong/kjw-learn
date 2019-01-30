package algorithm;

/**
 * 冒泡排序
 * */
public class MaoPaoSort {
    public static void main(String[] args) {
        int []arr = {8,6,4,7,3,5};
        sort(arr);
        System.out.println(arr);
    }

    /**
     * 核心思想：内层循环每一次都会将最大的数放在最后一位
     *          经过n此循环后变得有序
     * */
    private static void sort(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        int swap;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    swap = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }
}
