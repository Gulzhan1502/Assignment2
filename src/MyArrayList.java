import java.util.*;
public class MyArrayList<E> implements List<E> {
    private Object [] elements;
    private int size;
    public MyArrayList(){
        elements=new Object[10];
        size=0;
    }
    public boolean add(E element){
        if (size==elements.length){
            int newSize=elements.length *2;
            elements=Arrays.copyOf(elements,newSize);
        }

        elements[size]=element;
        size++;
        return true;
    }

}
