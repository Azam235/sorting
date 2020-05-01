package sorting;

public class SelectionSort_2 {
	
	public static void sort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	
	public static void main(String[] s) {
		int arr[]= {-9,-5,5,7,2,1,5,9,4,6};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
