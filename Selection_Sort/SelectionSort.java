package Selection_Sort;

public class SelectionSort {
    public static int[] selectionSort(int[] arra){
        int temp;
        for(int i = 0; i < arra.length -1; i++){
            int min = arra[i];
            int indexOfMin = i;
            for(int j = i+1;j < arra.length; j++){
                if(arra[j] < min){
                    min = arra[j];
                    indexOfMin = j;
                }
            }
            temp = arra[i];
            arra[i] = min;
            arra[indexOfMin] = temp;
        }

        return arra;
}
public static void main(String[] args) {
    int[] array = {22,3,55,66,31,1,5,6,73,2,4,0};
        int[] sortedArr;
        sortedArr = selectionSort(array);
        for(int i = 0; i< sortedArr.length; i++){
            System.out.print("[" + sortedArr[i] + "]");
        }
}
}
