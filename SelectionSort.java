import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = new int[10];
        sort(arr);
    }

    static void sort(int arr[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element of array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + (i + 1) + "]:");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            if (i == min_index) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        System.out.println();
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + (i + 1) + "]:" + arr[i]);
        }
    }
}
