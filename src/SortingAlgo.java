import java.util.Scanner;

public class SortingAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        selection_sort(arr);
//        bubble_sort(arr);
//        insertion_sort(arr);
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }

    private static void insertion_sort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else
                    break;
            }
        }
    }

    static void bubble_sort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }

    static void selection_sort(int[] arr){

        for(int i = 0; i< arr.length;i++){

            int minIndex=i;
            for(int j=i+1; j< arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }

            if(minIndex!=i){
                int temp;
                temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }

    static void swap(int[] arr,int x,int y){
        int temp;
        temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

}