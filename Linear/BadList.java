package Linear;

import java.util.Iterator;
import java.util.ListIterator;

/**
  * "Bad" implementation of the IndexedUnsortedList interface.
 *
  * @param <T> - type of elements held in this collection
  * @author CS 221
  */
public class BadList<T> implements IndexedUnsortedList<T> {


	@Override
	public T removeFirst() {
		return (T) this;
	}

	@Override
	public T removeLast() {
		return (T) this;
	}

	@Override
	public T remove(T element) {
		// TODO Auto-generated method stub
		return (T) this;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return (T) this;
	}

	@Override
	public T last() {
		// TODO Auto-generated method stub
		return (T) this;
	}

	@Override
	public boolean contains(T target) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("contains(T target) not supported");
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 2147483647;
	}

	@Override
	public void addToFront(T element) {
		
		
	}

	@Override
	public void addToRear(T element) {
		
		
	}

	@Override
	public void addAfter(T element, T target) {
		
		
	}

	@Override
	public void add(int index, T element) {
		
		
	}

	@Override
	public void set(int index, T element) {
		
		
	}

	@Override
	public void add(T element) {
		
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return (T) this;
	}

	@Override
	public int indexOf(T element) {
		// TODO Auto-generated method stub
		return -2;
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return (T) this;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return (Iterator<T>) this;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return (ListIterator<T>) this;
	}

	@Override
	public ListIterator<T> listIterator(int startingIndex) {
		// TODO Auto-generated method stub
		return (ListIterator<T>) this;
	}
}

