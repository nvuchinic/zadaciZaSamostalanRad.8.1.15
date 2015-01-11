package zadatak2;

public class SortedDynamicArrayInt {
	private int[] array;
	private int size;
	private final int DEFAULT_SIZE = 10;

	public SortedDynamicArrayInt() {
		size = 0;
		array = new int[DEFAULT_SIZE];
	}

	public void add(int value) {
		if (size == array.length)
			resize();
		array[size] = value;
		size++;
		array = sort(array);
	}
	
/**
 * method that sorts and returns integer array.It uses insertion sort algorithm
 * @param someArray integer array
 * @return sorted integer array
 */
	public int[] sort(int[] someArray) {
		int key;
		int i, j;
		for (j = 1; j < size; j++) {
			key = someArray[j];
			for (i = j - 1; i >= 0 && someArray[i] > key; i--) {
				someArray[i + 1] = someArray[i];
			}
			someArray[i + 1] = key;
		}
		return someArray;
	}

	/**
	 * removes element from integer array based on passed index
	 * @param index of array element to be removed
	 */
	public void remove(int index) {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException("...");
		for (int i = index; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		size--;
	}
 
	/**
	 * method for resizing array(doubles the array's size)
	 */
	private void resize() {
		int[] temp = new int[size * 2];
		for (int i = 0; i < size; i++) {
			temp[i] = array[i];
		}
		array = temp;
	}

	public int getSize() {
		return size;
	}
	
/**
 * method that checks if passed value exists in array
 * @param value value to be checked
 * @return true if passed value exists in array, otherwise false
 */
	public boolean contains(int value) {
		boolean exist = false;
		for (int i = 0; i < size; i++) {
			if (array[i] == value) {
				exist = true;
				break;
			}
		}
		return exist;
	}

	/**
	 * method that creates and returns the string representation of SortedDynamicArray object
	 * @return string representation of SortedDynamicArray object
	 */
	public String toString() {
		String str = "";
		str += "[ ";
		for (int i = 0; i < size; i++) {
			str += array[i];
			if (i != size - 1)
				str += ", ";
		}
		str += " ]";
		return str;
	}
}