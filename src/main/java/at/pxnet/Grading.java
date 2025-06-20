package at.pxnet;

public final class Grading {

    private Grading() {
        // prevent instantiation
        throw new UnsupportedOperationException("Utility class");
    }

    public static boolean isFailing(Person person) {
        int[] grades = person.getGrades();

        if (grades.length < 2) {
            throw new IllegalStateException("Person must have at least two grades.");
        }

        int countFours = 0;
        for (int grade : grades) {
            if (grade == 5) {
                return true;
            }
            if (grade == 4) {
                countFours++;
            }
        }

        return countFours >= 3;
    }
}
