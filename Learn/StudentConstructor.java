class StudentConstructor{

	int id;
	String name;
	
	Student(int i, String n){
		id = i;
		name = n;
	}

	void display(){
		System.out.println(id+" "+name);
	}

	public static void main(String args[]){
		Student s1 = new Student(1245, "Batch15");
		Student s2 = new Student(1246, "Batch15");

		s1.display();
		s2.display();
	}
}