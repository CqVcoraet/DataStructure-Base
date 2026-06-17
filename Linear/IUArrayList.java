package Linear;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class IUArrayList<T> implements IndexedUnsortedList<T> {
    private T[] array;
    private int size;
    public static final int DEFAULT_CAPACITY = 10;
    private long listModCount;

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
        size++;
        listModCount++;
    }

    @Override
    public void addToRear(T element) {
        resizeIfNeeded();
        array[size] = element;
        size++;
        listModCount++;
    }

    @Override
    public void addAfter(T element, T target) {
        if (!contains(target)) {
            throw new NoSuchElementException("Target is not in the list.");
        }
        int targetIndex = indexOf(target);
        add(targetIndex, element);
        size++;
        listModCount++;
    }

    @Override
    public void add(int index, T element) {
        checkBounds(index);
        resizeIfNeeded();
        for (int i = size; i > index; i++) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
        listModCount++;
    }

    @Override
    public T removeFirst() {
        T removed = first();
        array[0] = null;
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        listModCount++;
        return removed;
    }

    @Override
    public T removeLast() {
        T removed = last();
        array[size - 1] = null;
        size--;
        listModCount++;
        return removed;
    }

    @Override
    public T remove(T element) {
        int index = indexOf(element);
        if (index == -1) {
            throw new NoSuchElementException();
        }

        T removed = array[index];
        size--;

        // Shift elements
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        array[size] = null;
        listModCount++;
        return removed;
    }

    @Override
    public T remove(int index) {
        checkBounds(index);
        T removed = array[index];
        array[index] = null;
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
        array[size] = null;
        listModCount++;
        return removed;
    }

    @Override
    public void set(int index, T element) {
        checkBounds(index);
        array[index] = element;
        listModCount++;
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
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size; i++) {
            str.append(array[i].toString());
            str.append(", ");
        }
        if (!isEmpty()) {
            str.delete(str.length() - 2, str.length());
        }
        str.append("]");
        return str.toString();
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

    private class ALIterator implements Iterator<T> {
        private int nextIndex;
        private long iterModCount;
        private boolean canRemove;

        public ALIterator() {
            nextIndex = 0;
            iterModCount = listModCount;
            canRemove = false;
        }

        private void checkConcurrency() {
            if (iterModCount != listModCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override
        public boolean hasNext() {
            checkConcurrency();
            return (nextIndex < size);
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            nextIndex++;
            canRemove = true;
            return array[nextIndex - 1];
        }

        @Override
        public void remove() {
            if (!canRemove) {
                throw new IllegalStateException();
            }
            canRemove = false;
            for (int i = nextIndex - 1; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
            nextIndex--;
            listModCount++;
            iterModCount++;
        }

    }
    
}
