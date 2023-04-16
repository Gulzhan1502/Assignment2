interface MyList<T>{
    int size();

    int getSize();

    boolean contains(T object);
    void add(T newItem);
    void add(T newItem,int index);
    boolean remove(T item);
    T remove(int index);
    void clear();
    T get(int index);
    int indexOf(T object);
    int lastIdexOf(T object);
    void sort();

}
