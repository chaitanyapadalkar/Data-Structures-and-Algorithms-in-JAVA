import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch2D {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i< arr.length;i++) {
            for (int j=0;j<arr[i].length;j++) {
                arr[i][j]=sc.nextInt();

            }
        }
        int target = sc.nextInt();

        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));



    }
    static int[] search(int[][] arr, int target){
        for (int i=0;i< arr.length;i++) {
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target)
                    return new int[]{i, j};

            }

        }
        return new int[]{-1,-1};
    }
}
