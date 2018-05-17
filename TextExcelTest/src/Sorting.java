public class Sorting {

    Sorting(){


    }
    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
    private static int minimumPosition(int a[], int from) {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++) {
            if (a[i] < a[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;


    }
    public static void sorter(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minPos = minimumPosition(a, i);
            swap(a, minPos, i);
        }

    }
}


