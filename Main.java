import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        BinarySearchTree personTree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        int choice, age;
        String name;

        // Loop to display menu and execute the selected option
        while (true) {
            System.out.println("1. Add Person");
            System.out.println("2. Search by Name");
            System.out.println("3. Search by Age");
            System.out.println("4. Exit");
            System.out.print("Enter your choice");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the name: ");
                    name = scanner.next();
                    System.out.print("Enter the age: ");
                    age = scanner.nextInt();
                    personTree.insert(new Person(name, age));
                    break;
                case 2:
                    System.out.print("Enter the name: ");
                    name = scanner.next();
                    Person person = personTree.searchByName(name);
                    if (person != null) {
                        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
                    } else {
                        System.out.println("Person not found");
                    }
                    break;
                case 3:
                    System.out.print("Enter the age: ");
                    age = scanner.nextInt();
                    person = personTree.searchByAge(age);
                    if (person != null) {
                        System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
                    } else {
                        System.out.println("Person not found");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }

            /*
            Person person = new Person("Charlie", 27);
            Student student = new Student("Percy", 12, 4);
            OnlineStudent onlineStudent = new OnlineStudent("Jack", 17, 6, true);

            Person personArray[] = new Person[3];
            personArray[0] = person;
            personArray[1] = student;
            personArray[2] = onlineStudent;
            for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i]);
            }
            System.out.println();

            Student studentArray[] = new Student[3];
            studentArray[0] = student;
            studentArray[1] = new Student("Jack", 16, 5);
            studentArray[2] = onlineStudent;
            for (int i = 0; i < studentArray.length; i++) {
            System.out.println(studentArray[i]);
            }
            System.out.println();

            // Testing the checkAge() method
            Person underagePerson = new Person("Alex", 15);

            System.out.println(underagePerson.checkAge());
            System.out.println(student.checkAge());
            System.out.println(onlineStudent.checkAge());
             */
        }
    }
}
