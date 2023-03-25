import java.util.Scanner;

public class Student {

        private String name;
        private int age;
        private String className;

        public Student(String name, int age, String className) {
            this.name = name;
            this.age = age;
            this.className = className;
        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getClassName() {
            return className;
        }


        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setClassName(String className) {
            this.className = className;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter student age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter student class: ");
            String className = scanner.nextLine();

            Student student = new Student(name, age, className);

            System.out.println("Student information:");
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Class: " + student.getClassName());

    }

}
