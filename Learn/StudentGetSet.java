public class StudentGetSet{

	private int roll;
	private String name;
	
	public int getRoll()
	{
		return roll;
	}
	
	public void setRoll(int roll){
		this.roll = roll;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public void display(){
		System.out.println("Roll no: " + roll);
		System.out.println("Student name: " + name);
	}
	
	public static void main(String args[]){
		StudentGetSet s1 = new StudentGetSet();
    		s1.setRoll(101);
    		s1.setName("Barath");
    		s1.display();
	}
}