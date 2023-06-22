class Studentstatic{
	int rollno;
	String name;
	static String college = "KGM";
	
	Studentstatic(int r, String n){
		rollno = r;
		name = n;
	}

	void display(){
		System.out.println( rollno + " " + name + " " + college);
	}
	
	public static void main(String args[]){
	
		Studentstatic s1 = new Studentstatic( 111, "Karan");
		Studentstatic s2 = new Studentstatic( 222, "Aryan");
	
		s1.display();	
		s2.display();
	}
}