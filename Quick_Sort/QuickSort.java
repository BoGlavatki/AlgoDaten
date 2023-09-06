package Quick_Sort;

import java.util.Random;

public class QuickSort {

public static int[] quickSort(int[] array, int low, int hight){
int pivot = array[hight];
int leftPoint = low;
int rightPoint = hight;
int temp;
while(leftPoint <= rightPoint){
    while(array[leftPoint] < pivot){
        leftPoint++;
    }
    while(array[rightPoint] > pivot){
        rightPoint--;
    }
    if(rightPoint >= leftPoint){
        temp = array[leftPoint];
        array[leftPoint] = array[rightPoint];
        array[rightPoint] = temp;
        rightPoint--;
        leftPoint++;
    }
}
if(low < rightPoint){
    quickSort(array, low, rightPoint);
}
if(hight > leftPoint){
    quickSort(array, leftPoint, hight);
}
    return array;
}
    public static void main(String[] args) {

        int[] array = new int[100000];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100000000);
        }
        int[] sortedArr;
        long startTime = System.currentTimeMillis();
        sortedArr = quickSort(array, 0, (array.length - 1));
        long endTime = System.currentTimeMillis();
        System.out.println("Benötigte Zeit: " + (endTime - startTime));
        /*for(int i = 0; i< sortedArr.length; i++){
            System.out.print("[" + sortedArr[i] + "]");
        }*/
    }
}
