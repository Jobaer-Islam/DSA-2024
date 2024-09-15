package OOP;

public class TypesOfConstructor {
    public static void main(String[] args) {
        Student s1 = new Student(); //1st call
        Student s2 = new Student("Jobaer"); //2nd call
        Student s3 = new Student(10); //3rd call
    }
    static class Student {
        String name;
        int roll;
        Student(String name){ //parameterized constructor
            this.name = name;
            System.out.println(this.name);
        }
        Student(){ //Non-parameterised constructor
            System.out.println("Constructor is called");
        }

        Student(int roll){  //parameterized constructor
            this.roll = roll;
            System.out.println(this.roll);
        }
    }
}
