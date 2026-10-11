// Object as a parameter

class Student {

    int m1;
    int m2;

    void show(Student other) {

        if (this.m1 > other.m2) {
            System.out.println("Student 1 has more marks");
        }
        else if (other.m2 > this.m1) {
            System.out.println("Student 2 has more marks");
        }
        else {
            System.out.println("Both students have equal marks");
        }
    }
}


public class Main3 {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.m1 = 90;

        s2.m2 = 80;
        s2.m2 = 75;
        s2.m2 = 65;

        s1.show(s2);
        s2.show(s1);
    }
}