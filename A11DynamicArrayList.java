class DynamicArrayList {

    int size;
    int capacity;
    Object[] array;

    public DynamicArrayList() {
        this.capacity = 10;
        this.array = new Object[this.capacity];
    }

    public DynamicArrayList(int capacity) {
        this.capacity = capacity;
        this.array = new Object[this.capacity];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }

        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }

        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];
            if (i == index) {
                array[index] = data;
                size++;
            }
        }
    }

    public void delete(Object data) {
        for (int i = 0; i < size; i++) {
            if (data == array[i]) {
                for (int j = i; j < size; j++) {
                    array[j] = array[j + 1]; 
                }
                size--;
                break;
            }
        }
    }

    /**
     * @param data
     * @return index
     */
    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (data == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public void grow() {
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
    }

    public void shrink() {
        int newCapacity = capacity - 1;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        
        String string = "";
        for (int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }
        if (!"".equals(string)) {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }

        return string;
    }
}

public class A11DynamicArrayList {
    public static void main(String[] args) {
        
        DynamicArrayList array = new DynamicArrayList();

        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");

        System.out.println(array);

        array.delete("C");
        System.out.println(array);

    }
}
