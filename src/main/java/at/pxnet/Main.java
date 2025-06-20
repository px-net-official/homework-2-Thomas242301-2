package at.pxnet;

public class Main {
    public static void main(String[] args) {
        
        String id = "123";
        String name = "Thomas";
        int age = 21;
        int[] grades = {1, 2, 3, 4, 1};

        Person p = new Person(id, name, age, grades);

        System.out.println("ID: " + p.getId());
        System.out.println("Name: " + p.getName());
        System.out.println("Alter: " + p.getAge());
        System.out.print("Noten: ");
        for (int grade : p.getGrades()) {
            System.out.print(grade + " ");
        }
        System.out.println();

        System.out.println("Besteht die Person? " + !Grading.isFailing(p));

        University uni = new University();

        uni.addStudent(p);

        Person b = new Person("456", "Bob", 22, new int[]{4, 4, 4});
        uni.addStudent(b);

        Person c = new Person("789", "Clara", 20, new int[]{2, 5, 1});
        uni.addStudent(c);

        System.out.println("\nAlle Studierenden:");
        for (Person student : uni.getStudents()) {
            System.out.println("- " + student.getName());
        }

        System.out.println("\nDurchgefallen:");
        for (Person student : uni.getFailingStudents()) {
            System.out.println("- " + student.getName());
        }

        System.out.println("\nDurchschnittsalter: " + uni.getAverageAge());
    }
}
