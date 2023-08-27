import java.util.Scanner;

public class CountingSort {

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
        int k = max(arr);
        int count[] = new int[k + 1];
        int b[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= k; i++) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            b[--count[arr[i]]] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = b[i];
        }

        System.out.println();
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + (i + 1) + "]:" + arr[i]);
        }
    }

    static int max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

}
