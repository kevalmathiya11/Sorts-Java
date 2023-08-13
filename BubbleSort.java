import java.util.Scanner;

public class BubbleSort {
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

        for (int i = 0; i < arr.length; i++) {
            boolean flage = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flage = true;
                }
            }
            if (flage == false) {
                break;
            }
        }
        System.out.println();
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + (i + 1) + "]:" + arr[i]);
        }
    }
}