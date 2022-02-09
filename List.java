package priorityQueue;

public class List {
	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<>(10, new StudentComparator.NameComparator());
		Student s1 = new Student(1, "Simran", 9.8);
		Student s2 = new Student(2, "Ayush", 9.6);
		Student s3 = new Student(3, "Abhishek", 9.4);
		Student s4 = new Student(4, "Amisha", 9.7);
		Student s5 = new Student(5, "a", 9.7);
		Student s6 = new Student(6, "B", 9.7);
		Student s7 = new Student(7, "C", 9.7);
		Student s8 = new Student(8, "d", 9.7);
		Student s9 = new Student(9, "f", 9.7);
		pq.add(s7);
		pq.print();
		System.out.println();
		pq.add(s2);
		pq.print();
		System.out.println();
		pq.add(s6);
		pq.print();
		System.out.println();
		pq.add(s1);
		pq.print();
		System.out.println();
		pq.add(s3);
		
		
		
		pq.print();
	}
}
