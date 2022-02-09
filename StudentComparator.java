package priorityQueue;
import java.util.Comparator;

public class StudentComparator{
	public static class NameComparator implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			
			return s1.getName().toLowerCase().compareTo(s2.getName().toLowerCase());
		}
	}
	
	public static class GpaComparator implements Comparator<Student>{
		@Override
		public int compare(Student s1, Student s2) {
			if(s1.getGpa() > s2.getGpa())
				return 1;
			else if(s1.getGpa() < s2.getGpa())
				return -1;
			return 0;
		}
	}
}
