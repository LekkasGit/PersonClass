
import java.util.Scanner;

public class Application
{
    public static void main(String[] args) {
        BinarySearchTree studentTree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        String name;
        int choice, age, gradeAverage;

        while (true) {
            System.out.println("STUDENT TREE EXPLORER");
            System.out.println("[1] Add student");
            System.out.println("[2] Find (by name)");
            System.out.println("[3] Find (by age)");
            System.out.println("[4] Find (by grade average)");
            System.out.println("[5] List students");
            System.out.println("[6] Exit");
            System.out.println("Enter your choice:");

            choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    name = scanner.next();

                    System.out.print("Enter age: ");
                    age = scanner.nextInt();

                    System.out.print("Enter grade average");
                    gradeAverage = scanner.nextInt();

                    studentTree.insert(new Student(name, age, gradeAverage));
                    break;
                case 2:
                    System.out.print("Enter the name: ");
                    name = scanner.next();

                    Student student = studentTree.searchByName(name);
                    if (student != null) {
                        System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Average Grade: " + student.getGradeAverage());
                    } else {
                        System.out.println("Person not found");
                    }

                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter the age: ");
                    age = scanner.nextInt();

                    student = studentTree.searchByAge(age);
                    if (student != null) {
                        System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Average Grade: " + student.getGradeAverage());
                    } else {
                        System.out.println("Person not found");
                    }

                    System.out.println();
                    break;
                case 4:
                    System.out.print("Enter the average grade: ");
                    gradeAverage = scanner.nextInt();

                    student = studentTree.searchByGradeAverage(gradeAverage);
                    if (student != null) {
                        System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Average Grade: " + student.getGradeAverage());
                    } else {
                        System.out.println("Person not found");
                    }

                    System.out.println();
                    break;
            }

        }
    }
}
