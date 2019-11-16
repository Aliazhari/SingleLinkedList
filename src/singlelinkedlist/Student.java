package singlelinkedlist;

public class Student implements Comparable<Student>{
	
	private String id;
	private String name;
	private String email;
	private String major;
	private double gpa;
	
	
	public Student(String id, String name, String email, String major, double gpa) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.major = major;
		this.gpa = gpa;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}


	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
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
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", major=" + major + ", gpa=" + gpa + "]";
	}


	@Override
	public int compareTo(Student student) {
		if (gpa > student.gpa) return 1;
		else return -1;
	}
	
	
	
	

}
