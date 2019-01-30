package algorithm;

public class ChaRuSort {

    public static void main(String[] args) {
        int []arr = {8,6,4,7,3,5};
        sort(arr);
        System.out.println(arr);
    }

    /**
     * 核心思想：i前面的所有位置组成有序序列，i后面的位置组成无序序列
     *          从无需序列中选第一个（选其他都行，随便选），放到有序序列中正确的位置，到最后i=数组长度的时候序列就是有序的
     * */
    private static void sort(int[] arr){
        if(arr == null || arr.length == 0){
            return;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i] = temp;
                }else if(j == i){
                    arr[j]=arr[i];
                }
            }
        }
    }

}
