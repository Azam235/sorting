package sorting;

public class MergeSort {
	
	public static void merge(int[] arr, int left, int mid, int right) {
		int n1=mid-left+1;
		int n2=right-mid;
		
		int[] L=new int[n1];
		int[] R=new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i]=arr[left+i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=arr[mid+j+1];
		}
		
		int i=0,j=0;
		int k=left;
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k]=L[i];
			k++;
			i++;
		}
		while(j<n2) {
			arr[k]=R[j];
			k++;
			j++;
		}
	}
	
	public static void sort(int[] arr,int left, int right) {
		if(left<right) {
			int mid=(left+right)/2;
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	
	public static void main(String[] s) {
		int arr[]= {-9,-5,5,7,2,1,5,9,4,6};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
