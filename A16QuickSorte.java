public class A16QuickSorte {
    public static void main(String[] args) {

        int array[] = new int[100];
        quickSorte(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private static void quickSorte(int array[], int start, int end) {
        if (end <= start) return;

        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        quickSorte(array, start, i - 1);
        quickSorte(array, i + 1, end);
    }
}
