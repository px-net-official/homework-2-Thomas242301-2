package at.pxnet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class University {
    private final List<Person> students;

    public University() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Person person) {
        if (person == null) return;
        if (!students.contains(person)) {
            students.add(person);
        }
    }

    public void removeStudent(Person person) {
        students.remove(person);
    }

    public List<Person> getStudents() {
        return Collections.unmodifiableList(students);
    }

    public List<Person> getFailingStudents() {
        List<Person> failing = new ArrayList<>();
        for (Person p : students) {
            if (Grading.isFailing(p)) {
                failing.add(p);
            }
        }
        return Collections.unmodifiableList(failing);
    }

    public double getAverageAge() {
        if (students.isEmpty()) return 0;
        int total = 0;
        for (Person p : students) {
            total += p.getAge();
        }
        return total / (double) students.size();
    }
}
