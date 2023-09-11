public class Merge_Sort {
	static int k = 0;
	private static void mergeSort(int[] array) {
		int lenght = array.length;
		if(lenght <= 1)
			return;
		int mid = lenght / 2; 
		int[] leftArray = new int[mid];
		int[] rightArray = new int[lenght - mid];
		
		int i = 0;
		int j = 0;
		
		for(; i < lenght; i++) {
			if(i < mid) {
				leftArray[i] = array[i];
			}
			else {
				rightArray[j] = array[i];
				j++;
			}
		}
		
		
		mergeSort(rightArray);
		mergeSort(leftArray);
		merge(leftArray, rightArray, array);
		
		
	}
	

	private static void merge(int[] leftArray, int[] rightArray, int[] array) {
		
		int leftSize = array.length / 2;
		int rightSize = array.length - leftSize;
		int i = 0, l = 0, r = 0; 
		while(l < leftSize && r < rightSize) {
			if(leftArray[l] < rightArray[r]) {
				array[i] = leftArray[l];
				l++;
				i++;
			}
			else {
				array[i] = rightArray[r];
				r++;
				i++;
			}
		}
		while (l < leftSize) {
			array[i] = leftArray[l];
			l++;
			i++;
		}
		while (r < rightSize) {
			array[i] = rightArray[r]; 
			r++;
			i++;
		}
	}


	public static void main(String[] args) {
		int[] arr;
		int zahlen [] = {11,22,3,422,516,27,82,9};
		
		mergeSort(zahlen);
		for (int i = 0; i < zahlen.length; i++) {
			System.out.print("["+zahlen[i]+"]");

	}
		}

}
