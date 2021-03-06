package Exercise2;

import java.util.Arrays;

public class MinInHeap {

	private int capacity = 10;
	private int size = 0;
	// creating an array of fixed length
	int[] items = new int[capacity];

	private int getLeftChildIndex(int parentIndex) {
		return 2 * parentIndex + 1;
	}

	private int getRightChildIndex(int parentIndex) {
		return 2 * parentIndex + 2;
	}

	private int getParentIndex(int childIndex) {
		return (childIndex - 1) / 2;
	}

	private boolean hasLeftChild(int index) {
		return getLeftChildIndex(index) < size;
	}

	private boolean hasRightChild(int index) {
		return getRightChildIndex(index) < size;
	}

	private boolean hasParent(int index) {
		return getParentIndex(index) >= 0;
	}

	private int leftChild(int index) {
		return items[getLeftChildIndex(index)];
	}

	private int RightChild(int index) {
		return items[getRightChildIndex(index)];
	}

	private int parent(int index) {
		return items[getParentIndex(index)];
	}

	private void swap(int indexOne, int indexTwo) {
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}

//This method will check if array is full, if so it creates new array
//double of the size and copies all the elements over
	private void ensureExtractCapacity() {
		if (size == capacity) {
			items = Arrays.copyOf(items, capacity * 2);
			capacity *= 2;
		}
	}

//the peek method will check if array is empty, it will return exception
//other it will return the first element of the array
	public int peek() {
		if (size == 0)
			throw new IllegalStateException();
		return items[0];

	}

//this method will remove the first element and get the last element to the root
	public int poll() {
		if (size == 0)
			throw new IllegalStateException();
		int item = items[0];
		items[0] = items[size - 1];
		size--;
		// heapifydown will sort it back in order
		heapifyDown();
		return item;
	}

	public void add(int item) {
		ensureExtractCapacity();
		items[size] = item;
		size++;
		// swap each element with its parents
		heapifyUp();

	}

//this method will remove an element from the end tree
	public int remove() {
		return items[--size];

	}

//method will print the array in the console
	public void printPriorityQueue() {
		for (int i = 0; i < size; i++) {
			System.out.println(items[i] + " ");
		}
	}

	public void heapifyUp() {
		int index = size - 1;
		while (hasParent(index) && parent(index) > items[index]) {
			swap(getParentIndex(index), index);
			index = getParentIndex(index);

		}
	}

	public void heapifyDown() {
		int index = 0;
		while (hasLeftChild(index)) {
			int smallChildIndex = getLeftChildIndex(index);
			if (hasRightChild(index) && RightChild(index) < leftChild(index)) {
				smallChildIndex = getRightChildIndex(index);
			}

			if (items[index] < items[smallChildIndex]) {
				break;

			} else {
				swap(index, smallChildIndex);

			}
			index = smallChildIndex;
		}

	}
}
