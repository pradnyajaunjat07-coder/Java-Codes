//Returning an Object from Method.

class Student {

    String name;
    int marks;
}


class StudentFactory {

    Student createStudent() {

        Student s = new Student();

        s.name = "Avi";
        s.marks = 95;

        return s;
    }
}


public class ReturnObjectFromMethod {

    public static void main(String[] args) {

        StudentFactory f1 = new StudentFactory();

        Student s1 = f1.createStudent();

        System.out.println("The name of student is: " + s1.name);
        System.out.println("The marks of student is: " + s1.marks);
    }
}