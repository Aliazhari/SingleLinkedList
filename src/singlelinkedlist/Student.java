package singlelinkedlist;

/**
 * @author Ali Azhari
 * @File Student.java
 *
 */
public class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	private double gpa;
	
	
	public Student(int id, String name, double gpa) {

		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	

	


	


	

	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}


	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gpa=" + gpa + "]";
	}


	@Override
	public int compareTo(Student student) {
		if (gpa > student.gpa) return 1;
		else return -1;
	}
	
	
	
	

}
