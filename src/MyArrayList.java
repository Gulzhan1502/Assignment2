public class MyArrayList<T> implements MyList<T> {
    public Object[] arr;
    public int size;
    public int capacity;


    public MyArrayList() {
        arr = new Object[capacity];
        size = 0;
        capacity = 10;

    }

    @Override
    public void add(T newItem) {
        if (size == capacity) {
            increaseArr();
        }
        arr[size++] = newItem;
    }

    @Override
    public void add(T newItem, int index) {
        if (index > capacity || index < 0) throw new IndexOutOfBoundsException();
        if (size == capacity) {
            increaseArr();
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = newItem;
        size++;
    }


    private void increaseArr() {
        capacity = (int) (2 * capacity);
        Object[] newArr = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        newArr = arr;

    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) arr[index];
    }

    @Override
    public int indexOf(T o) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == o) return i;
        }
        return -1;
    }

    @Override
    public int lastIdexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] == o) return i;
        }
        return -1;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (((Comparable<T>) arr[j]).compareTo((T) arr[j + 1]) > 0) {
                    T temp = (T) arr [j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return null;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public int getSize() {
        return size;
    }
    @Override
    public boolean contains(T o) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public boolean remove(T item) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == item) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        arr = new Object[size];
    }





}
