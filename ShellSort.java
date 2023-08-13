import java.util.Scanner;

public class ShellSort {
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
        int n = arr.length;
        for (int gap = n / 2; gap >= 1; gap = gap / 2) {
            for (int j = gap; j < n; j++) {
                for (int i = j - gap; i >= 0; i = i - gap) {
                    if (arr[i + gap] > arr[i]) {
                        break;
                    } else {
                        int temp = arr[i];
                        arr[i] = arr[i + gap];
                        arr[i + gap] = temp;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + (i + 1) + "]:" + arr[i]);
        }
    }
}
