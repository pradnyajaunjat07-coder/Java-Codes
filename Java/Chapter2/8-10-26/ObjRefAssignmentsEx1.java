 // Object Reference Assignment

public class ObjRefAssignmentsEx1 {

    public static void main(String[] args) {

        Student s1 = new Student();

        Student s2 = s1;

        s1.name = "Sahil";

        System.out.println("The name is: " + s1.name);
        System.out.println(s2.name);
    }
}


class Student {

    String name;
}