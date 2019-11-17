package singlelinkedlist;

public class SingleLinkedListDemo {

	public static void main(String[] args) {
		

		CustomLinkedList<Student> cllist = new CustomLinkedList<>();
		Student s1 = new Student(1, "Ali",  3.7 );
		cllist.add(s1);
		s1 = new Student(2, "Paul",  3.9);
		cllist.add(s1);
		s1 = new Student(3, "Susan",  4.0);
		cllist.add(s1);
		
//		cllist.printLinkeList();
//		
		for (Student student : cllist) {
			System.out.println(student);
		}
//		cllist.printLinkeList();

	}

}
