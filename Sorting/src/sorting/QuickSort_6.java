package sorting;

public class QuickSort_6 {
	
	public static void swap(int[] arr,int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
	
	public static int partition(int[] arr, int start, int end ) {
		int pivot=arr[end];
		int pIndex=start;
		
		for(int i=start;i<end;i++) {
			if(arr[i]<=pivot) {
				swap(arr,i,pIndex);
				pIndex++;
			}
		}
		swap(arr,pivot,pIndex);
		return pIndex;
	}
	
	public static void sort(int[] arr, int start, int end) {
		if(start>=end) {
			return;
		}
		int pivot=partition(arr,start,end);
		
		partition(arr,start,pivot-1);
		partition(arr,pivot+1,end);
	}
	
	public static void main(String[] s) {
		int arr[]= {-9,-5,5,7,2,1,5,9,4,6};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
