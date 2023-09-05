public class BubbleSort{

    public static int[] sortArr(int[] array){
        int temp;
        for(int j = 0; j < array.length-1; j++){
            for(int i = 0; i < array.length-1; i++){
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println("Hello Bubble");
        int[] array = {22,3,55,66,31,1,5,6,73,2,4,0};
        int[] sortedArr;
        sortedArr = sortArr(array);
        for(int i = 0; i< sortedArr.length; i++){
            System.out.print("[" + sortedArr[i] + "]");
        }
    }
}