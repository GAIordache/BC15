package iterator1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayIterator<T> implements Iterator<T> {
	private T[] array;
	private int cidx = -1;
	
	MyArrayIterator(T[] pArray) {
		array = pArray;
	}

	@Override
	public boolean hasNext() {
		if(array == null) {
			return false;
		}
		cidx++;
		if(cidx >= array.length) {
			return false;
		}
		return true;
	}

	@Override
	public T next() {
		if(array == null || cidx >= array.length || cidx < 0) {
			throw new NoSuchElementException();
		}
		return array[cidx];
	}

}
