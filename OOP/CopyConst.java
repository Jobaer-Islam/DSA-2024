package OOP;

public class CopyConst {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Jobaer";
        s1.roll = 10;
        s1.password = "Abc123";
        Student s2 = new Student(s1);
        s2.password = "xyz098";
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }

    static class Student {
        String name;
        int roll;
        String password;

        // Default Constructor
        Student() {
        }

        // Copy Constructor
        Student(Student s1) {
            this.name = s1.name;
            this.roll = s1.roll;
        }
    }
}
