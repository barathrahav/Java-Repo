class StudentMethod{

	int rollno;
	String name;
	static String college = "KGM";
	static void change(){
		college = "MGM";
	}

	StudentMethod(int r, String n){
		rollno = r;
		name = n;
	}

	void display(){
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String args[]){
		StudentMethod.change();
		
		StudentMethod s1 = new StudentMethod(111, "Kumar");
		StudentMethod s2 = new StudentMethod(112, "Ravi");
		StudentMethod s3 = new StudentMethod(113, "Ram");

		s1.display();
		s2.display();
		s3.display();
	}
}
