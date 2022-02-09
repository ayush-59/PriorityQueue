package priorityQueue;
import java.util.Comparator;

class PriorityQueue<E extends Comparable<E>> {
	E[] heap;
	int size;
	int maxSize;
	Comparator<E> comparator;
	
	public PriorityQueue(int maxSize) {
		this.maxSize = maxSize;
		heap = (E[])(new Comparable[maxSize]);
		size = 0;
		this.comparator = null;
	}
	public PriorityQueue(int maxSize, Comparator<E> comparator) {
		this.maxSize = maxSize;
		heap = (E[])(new Comparable[maxSize]);
		size = 0;
		this.comparator = comparator;
	}
	
	public void add(E val) {
		heap[size] = val;
		swim(size);
		size++;
	}
	public E get() {
		E obj = heap[0];
		
		heap[0] = heap[--size];
		sink(0);
		return obj;
	}
	public void print() {
		for(int i = 0; i < size; i++) {
			System.out.print(heap[i] + " ");
		}
	}

	private void swap(int x, int y) {
		E temp = heap[x];
		heap[x] = heap[y];
		heap[y] = temp;
	}
	
	private void swim(int k) {
		if(k==0)
			return;
		if(cmp(heap[(k-1)/2], heap[k]) > 0){
			swap((k-1)/2,k);
			swim((k-1)/2);
		}
	}
	private int cmp(E a, E b) {
		if(comparator == null)
			return a.compareTo(b);
		
		return comparator.compare(a, b);
	}
	private void sink(int k) {
		int minChild;
		while(k < size-1) {
			if(cmp(heap[2*k+1], heap[2*k+2]) < 0 )
				minChild = 2*k+1;
			else
				minChild = 2*k+2;
			
			if(cmp(heap[minChild], heap[k]) < 0) {
				swap(minChild, k);
				k = minChild;
			}else {
				break;
			}
		}
	}
	
}

