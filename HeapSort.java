import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        sort(arr);

    }

    static void maxHeapify(int arr[], int n, int i) {
        int largest = i;

        int l = (2 * i) + 1;
        int r = (2 * i) + 2;

        while (l < n && arr[l] > arr[largest]) {
            largest = l;
        }
        while (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            maxHeapify(arr, n, largest);
        }
    }

    static void sort(int arr[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element of array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + (i + 1) + "]:");
            arr[i] = sc.nextInt();
        }

        int n = arr.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            maxHeapify(arr, i, 0);
        }

        System.out.println();
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + (i + 1) + "]:" + arr[i]);
        }
    }
}