package oopsprmgs;

class Student{
	private String name;
	private int rollNo;
	private float marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		if(marks>=0 && marks<=100) {
			this.marks=marks;
			}else {
				System.out.println(marks+" is an invalid Marks! Marks must be between 0 and 100.");
			}
	}
	
	
}
public class StudentAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setName("Dharma");
		s1.setRollNo(22005552);
		s1.setMarks(95);
		s1.setMarks(150);
		
		System.out.printf("Name: "+s1.getName()+"\nRoll No: "+s1.getRollNo()+"\nMarks: "+s1.getMarks());
	}

}
