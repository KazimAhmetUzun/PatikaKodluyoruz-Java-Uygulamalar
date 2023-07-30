public class MyList<T> {

    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Boş constructor
    public MyList() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Constructor ile başlangıç kapasitesini belirleme
    public MyList(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException("Geçersiz kapasite: " + capacity);
        array = new Object[capacity];
        size = 0;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }

    public void add(T data) {
        if (size == array.length)
            ensureCapacity();
        array[size++] = data;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
    }

    public void set(int index, T data) {
        checkIndex(index);
        array[index] = data;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (data.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (data.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public T[] toArray() {
        T[] newArray = (T[]) new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);
        return newArray;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public MyList<T> subList(int start, int finish) {
        if (start < 0 || start >= size || finish <= start || finish > size)
            throw new IndexOutOfBoundsException("Geçersiz alt liste indeksi: " + start + ", " + finish);

        MyList<T> subList = new MyList<>(finish - start);
        System.arraycopy(array, start, subList.array, 0, finish - start);
        subList.size = finish - start;

        return subList;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    private void ensureCapacity() {
        int newCapacity = array.length * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Geçersiz indeks: " + index);
    }

    @Override
    public String toString() {
        if (size == 0)
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i]).append(", ");
        }
        sb.append(array[size - 1]).append("]");

        return sb.toString();
    }
}
