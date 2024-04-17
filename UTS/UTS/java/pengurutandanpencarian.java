package UTS.java;

public class pengurutandanpencarian {
    private int[] array;

    public pengurutandanpencarian(int[] array) {
        this.array = array;
    }

    public int findBinarySearch(int cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (array[mid] == cari) {
                return mid;
            }

            int leftResult = findBinarySearch(cari, left, mid - 1);
            if (leftResult != -1) {
                return leftResult;
            }

            return findBinarySearch(cari, mid + 1, right);
        }

        return -1;
    }

    public void tampilAll() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr, boolean ascending) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (ascending) {
                    if (arr[j] < arr[index]) {
                        index = j;
                    }
                } else {
                    if (arr[j] > arr[index]) {
                        index = j;
                    }
                }
            }
            if (index != i) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return -1;
    }

    public int[] getArray() {
        return array;
    }
}
        