package OOP;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Jobaer");
        System.out.println(s1.name);

    }
    static class Student {
        String name;
        int roll;
        Student(String name ){
            this.name = name;
        }

    }
}
