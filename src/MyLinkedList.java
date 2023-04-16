

public class MyLinkedList<T> implements MyList<T> {
    private class Node {
        T element;
        Node next;
        Node prev;

        public Node(T element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
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
    public boolean contains(T object) {
        Node current = head;
        while (current != null) {
            if (current.element == object) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void add(T newItem) {
        Node newNode = new Node(newItem, null, tail);
        if (size == 0) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public void add(T newItem, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(newItem, null, null);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else if (index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (index == size) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            Node current = head;
            int i = 0;
            while (i < index - 1) {
                current = current.next;
                i++;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;

    }

    @Override
    public boolean remove(T item) {
        Node current = head;
        while (current != null) {
            if (current.element.equals(item)) {
                if (current.prev == null) {
                    head = current.next;
                } else {
                    current.prev.next = current.next;
                }
                if (current.next == null) {
                    tail = current.prev;
                } else {
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        if (current.prev == null) {
            head = current.next;
        } else {
            current.prev.next = current.next;
        }
        if (current.next == null) {
            tail = current.prev;
        } else {
            current.next.prev = current.prev;
        }
        size--;
        return null;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.element;
    }

    @Override
    public int indexOf(T object) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.element == object) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public int lastIdexOf(T object) {
        Node current = tail;
        int index = size - 1;
        while (current.prev != null) {
            if (current.element == object) {
                return index;
            }
            current = current.prev;
            index--;
        }
        return -1;
    }

    @Override
    public void sort() {

    }
}
