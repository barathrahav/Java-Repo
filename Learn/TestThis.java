class StudentThis {
    int rollno;
    String name;
    float fee;

    StudentThis(int rollno, String name, float fee) {
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
}

class TestThis {
    public static void main(String[] args) {
        StudentThis s1 = new StudentThis(111, "Kumar", 5000f);
        StudentThis s2 = new StudentThis(112, "Ravi", 5000f);
        StudentThis s3 = new StudentThis(113, "Ram", 5000f);

        s1.display();
        s2.display();
        s3.display();
    }
}