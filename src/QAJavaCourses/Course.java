package QAJavaCourses;

import java.util.Arrays;

public abstract class Course implements Schedule {

    private Trainer trainer;
    private Student[] students;

    protected Course(int courseSize, Trainer trainer) {
        students = new Student[courseSize];
        this.trainer = trainer;
    }

    public void addStudent(Student student) {
        for(int i = 0; i < students.length; i++) {
            if(student == students[i])
                continue;

            if(students[i] == null) {
                students[i] = student;
                return;
            }
        }
    }

    public boolean courseIsFull() {
        boolean full = true;

        for(Student student : students)
            full = student != null;
        return full;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(students, students.length);
    }

    public abstract String getName();
}
