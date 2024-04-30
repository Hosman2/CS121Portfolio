public class Main {
    public static void main(String[] args) {
        Sorting sorting = new Sorting();

        int[] unsorted = sorting.getArray();
        System.out.println("Unsorted Array:");
        System.out.println(java.util.Arrays.toString(unsorted));

        sorting.sortArray(unsorted);

        System.out.println("Sorted Array:");
        System.out.println(java.util.Arrays.toString(unsorted));
    }
}
