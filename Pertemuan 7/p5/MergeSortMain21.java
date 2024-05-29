package p5;

public class MergeSortMain21 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("Sorting dengan Merge Sort");
        MergeSorting21 mSort = new MergeSorting21();
        System.out.println("Data awal:");
        mSort.printArray(data);
        mSort.sort(data, 0, data.length - 1);
        System.out.println("Setelah diurutkan:");
        mSort.printArray(data);
    }
}
