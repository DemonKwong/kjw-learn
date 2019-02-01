package algorithm;

public class KuaiSuSort {
	public static void main(String[] args) {
		int []arr = {8,6,4,7,3,5};
		sort(arr);
		System.out.println(arr);

	}


	private static void sort(int[] arr){
		if(arr == null || arr.length == 0){
			return;
		}
		quickSort(arr,0,arr.length-1);
	}

	/**
	 * 核心思想：随机选个数作为比较数，此处选第一个，将范围内的比 比较数小的数字放在左边，大的放在右边。
	 *             排序完成后用递归对左右两边的继续运用此算法
	 * */
	private static void quickSort(int[] arr,int left,int right){
		int l = left;
		int r = right;
		if(left >= right){
			return;
		}
		int temp = arr[left];
		int emptyIndex = left;
		while (left < right) {
			if(emptyIndex == left){
				if(arr[right]<temp){
					arr[left] = arr[right];
					emptyIndex = right;
					left++;
				}else{
					right--;
				}
			}else if(emptyIndex == right){
				if(arr[left]>temp){
					arr[right] = arr[left];
					emptyIndex = left;
					right--;
				}else{
					left++;
				}
			}
		}
		arr[left] = temp;
		quickSort(arr,l,left-1);
		quickSort(arr,left+1,r);
	}

}
