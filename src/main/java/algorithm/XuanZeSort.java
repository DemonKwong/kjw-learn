package algorithm;

public class XuanZeSort {
    public static void main(String[] args) {
        int []arr = {8,6,4,7,3,5};
        sort(arr);
        System.out.println(arr);
    }


    /**
     * 核心思想：i前面的所有位置组成有序序列，i后面的位置组成无序序列
     *          从无需序列中选一个最小的放在i的位置，到最后i=数组长度的时候整个序列就是有序序列
     * */
    private static void sort(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            int mix = arr[i];
            for(int j = i;j<arr.length;j++){
                if(arr[j]<mix){
                    arr[i] = arr[j];
                    arr[j] = mix;
                    //交换完后要将最小值重新赋值给mix，此处的mix起到了swap交换的作用和记录最小数的双重功能
                    mix = arr[i];
                }
            }

        }
    }
}
