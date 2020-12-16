package QAJavaCourses;

import java.time.LocalDate;
import java.time.Period;

public class JavaCourse extends Course {
    public JavaCourse(int courseSize, Trainer trainer) {
        super(courseSize, trainer);
    }

    public String getName() {
        return getTrainer().getName() + "'s Java Course";
    }

    LocalDate courseStart = LocalDate.of(2020, 11, 2);
    LocalDate courseEnd = LocalDate.of(2020, 11, 20);
    Period p = Period.between(courseStart, courseEnd);

    public int getDuration() {
        return p.getDays();
    }

    @Override
    public LocalDate getCourseStart() {
        return courseStart;
    }
}
