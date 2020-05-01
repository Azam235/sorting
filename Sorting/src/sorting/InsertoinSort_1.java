package sorting;

public class InsertoinSort_1 {
	
	public static void sort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]>arr[i]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	
	public static void main(String[] s) {
		int arr[]= {3,5,-2,8,9,4,6,8,7,2};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
