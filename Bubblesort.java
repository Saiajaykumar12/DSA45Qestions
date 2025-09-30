public class Bubblesort{
    public static void main(String[] args) {
        int[] arr = {21,31,12,14,51};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            bubbleSort(arr);
        }
    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}