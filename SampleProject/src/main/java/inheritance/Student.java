package inheritance;

public class Student extends Person {
	private int rollno;

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void show() {
		display();
		System.out.println("Roll number " +rollno);

	}

}
