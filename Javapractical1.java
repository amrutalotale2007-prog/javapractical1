package javapractical1;

class Student {
    int id;
    String name;

   
    Student() {
        id = 0;
        name = "Unknown";
    }

   
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    void display(String msg) {
        System.out.println(msg);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }


    static void college() {
        System.out.println("College Name: ABC College");
    }
}

public class Javapractical1 {

    public static void main(String[] args) {

        Student.college();

        Student s1 = new Student();
        s1.display();

        System.out.println();

        Student s2 = new Student(101, "Rahul");
        s2.display("Student Details");
    }
}