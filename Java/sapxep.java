import java.util.Scanner;

/*
Chuong trình sap xep mang so nguyên theo thu tu tang dan.
*/
public class sapxep {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        // kh?i t?o arr
        int[] arr = new int[n];
        System.out.print("Nhap cac phan tu cua mang: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        // sap xep dãy so theo thu tu tang dan
        sortASC(arr);
        System.out.println("Daz so sau khi duoc sap xep tang dan: ");
        show(arr);
    }

    /**
     * sap xep mang so nguyên theo thu tu tang dan
     * 
     * @param arr: mang các ss nguyên
     * @param n:   so phan tu cua mang
     */
    public static void sortASC(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    /**
     * in các phan tu cua mang ra man hinh
     * 
     * @param arr: mang các so nguyên
     * @param n:   so phan tu cua mang
     */
    public static void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}