import java.util.*;

class Bubble {
    public static <T extends Comparable<T>> T[] bsort(T arr[], int limit) {
        for (int i = 0; i < limit - 1; i++) {
            for (int j = 0; j < limit - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}

class Bsort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        String[] s = new String[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        s = Bubble.bsort(s, n);
        System.out.println("Elements after sorting:");
        for (String str : s) {
            System.out.println(str);
        }
    }
}
