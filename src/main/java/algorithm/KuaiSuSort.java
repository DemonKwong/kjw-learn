package algorithm;

public class KuaiSuSort {
	public static void main(String[] args) {
		int[] a ={1,2,3,4,5,6,7};
		int i=5;
		System.out.println(a[i--]);
		System.out.println(i);

	}


	private static void sort(int[] arr){
		if(arr == null || arr.length == 0){
			return;
		}
	}

	private static void quickSort(int[] arr,int left,int right){
		if(left == right){
			return;
		}
		int temp = arr[left];
		int emptyIndex = left;
		while (left != right) {
			if(emptyIndex == left){
				if(arr[right]<temp){
					arr[left] = arr[right];
					emptyIndex = right;
				}
				left++;
			}else if(emptyIndex == right){
				if(arr[left]>temp){
					arr[right] = arr[left];
					emptyIndex = left;
				}
				right--;
			}
		}
		arr[left] = temp;
	}

}
