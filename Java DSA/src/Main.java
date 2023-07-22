    import java.util.Arrays;
    import java.util.Scanner;

    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
    // then press Enter. You can now see whitespace characters in your code.
    public class Main {
        public static void main(String[] args) {

                int[] arr1={1,2,3,4,5,6};
                LinearSearch obj= new LinearSearch();
                boolean found= obj.search(arr1,5);

                if(found)
                    System.out.println("Key found");
                else
                    System.out.println("Key not found");

            }
        }