package Insertion_Sort;  
public class InsertionSort{

    public static int[] insertionSort(int[] array){

        int temp; 
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i; j >= 0; j--){
                if(array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }
    public static void main(String[] args) {
        int[] array = {22,3,55,66,31,1,5,6,73,2,4,0};
        int[] sortedArr;
        sortedArr = insertionSort(array);
        for(int i = 0; i< sortedArr.length; i++){
            System.out.print("[" + sortedArr[i] + "]");
        }
    }

}