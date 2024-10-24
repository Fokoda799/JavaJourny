public class A12Search {
    public static void main(String[] args) {
        // All Search algorithms are implemented here

        int sortedArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int unsortedArray[] = {5, 2, 7, 1, 9, 3, 6, 8, 4, 10};

        // Linear Search
        System.out.println("Linear Search sorted array: " + linearSearch(sortedArray, 5));
        System.out.println("Linear Search unsorted array: " + linearSearch(unsortedArray, 5));

        // Binary Search
        System.out.println("Binary Search sorted array: " + binarySearch(sortedArray, 5));

        // Interpolation Search
        System.out.println("Interpolation Search sorted array: " + interpolationSearch(sortedArray, 5));


    
    }

    static int linearSearch(int array[], int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int array[], int data) {
        int height = array.length - 1;
        int low = 0;

        while (low < height) {
            int meddle = (height - low) / 2;

            if (data > array[meddle]) low = meddle + 1;
            else if (data < array[meddle]) height = meddle - 1;
            else return meddle;
        }
        return -1;
    }

    static int interpolationSearch(int array[], int data) {
        int height = array.length - 1;
        int low = 0;

        while (low < height) {
            int meddle = low + ((height - low) / (array[height] - array[low])) * (data - array[low]);

            if (data > array[meddle]) low = meddle + 1;
            else if (data < array[meddle]) height = meddle - 1;
            else return meddle;
        }
        return -1;
    }
}
