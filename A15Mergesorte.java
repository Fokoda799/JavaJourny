public class A15Mergesorte {
    public static void main(String[] args) {

        int array[] = {3, 6, 9, 1, 4, 7, 10, 2, 5, 8};
        mergeSorte(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    private static void mergeSorte(int array[]) {
        int len = array.length;
        
        if (len <= 1) return;

        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, len - mid);

        mergeSorte(left);
        mergeSorte(right);

        merge(left, right, array);

    }

    private static void merge(int left[], int right[], int array[]) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while (l < leftSize && r < rightSize) {
            if (left[l] < right[r]) {
                array[i] = left[l];
                i++;
                l++;
            } else {
                array[i] = right[r];
                i++;
                r++;
            }
        }
        
        while (l < leftSize) {
            array[i] = left[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            array[i] = right[r];
            i++;
            r++;
        }


    }
}
