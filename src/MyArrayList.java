import java.util.*;
public class MyArrayList<T> implements MyList<T> {
    private Object[] arr;
    private int size;
    private int capacity;


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


    private void increaseArr() {
        capacity = (int) (2 * capacity);
        Object[] newArr = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        newArr = arr;

    }


    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }



}
