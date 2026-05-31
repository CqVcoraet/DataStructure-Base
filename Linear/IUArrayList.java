package Linear;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class IUArrayList<T> implements IndexedUnsortedList<T> {
    private T[] array;
    private int size;
    public static final int DEFAULT_CAPACITY = 10;

    public IUArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public IUArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be greater than 0");
        }
        array = (T[]) new Object[initialCapacity];
        size = 0;
    }

    private void resizeIfNeeded() {
        if (size == array.length) {
            int newCapacity = array.length * 2;
            
            @SuppressWarnings("unchecked")
            T[] newArray = (T[]) new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    private void checkBounds(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
    }

    @Override
    public void addToFront(T element) {
        resizeIfNeeded();
        for (int i = size; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = element;
    }

    @Override
    public void addToRear(T element) {
        resizeIfNeeded();
        array[size] = element;
        size++;
    }

    @Override
    public void addAfter(T element, T target) {
        if (!contains(target)) {
            throw new NoSuchElementException("Target is not in the list.");
        }
        int targetIndex = indexOf(target);
        add(targetIndex, element);
    }

    @Override
    public void add(int index, T element) {
        checkBounds(index);
        resizeIfNeeded();
        for (int i = size; i > index; i++) {
            array[i] = array[i - 1];
        }
        array[index] = element;
    }

    @Override
    public T removeFirst() {
        T removed = first();
        array[0] = null;
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return removed;
    }

    @Override
    public T removeLast() {
        T removed = last();
        array[size - 1] = null;
        size--;
        return removed;
    }

    @Override
    public T remove(T element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public T remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void set(int index, T element) {
        checkBounds(index);
        array[index] = element;
    }

    @Override
    public T get(int index) {
        checkBounds(index);
        return array[index];
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T first() {
        return array[0];
    }

    @Override
    public T last() {
        return array[size - 1];
    }

    @Override
    public boolean contains(T target) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(target)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public ListIterator<T> listIterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }

    @Override
    public ListIterator<T> listIterator(int startingIndex) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listIterator'");
    }
    
}
