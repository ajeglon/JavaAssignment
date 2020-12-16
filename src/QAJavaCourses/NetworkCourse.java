package QAJavaCourses;

import java.time.LocalDate;
import java.time.Period;

public class NetworkCourse extends Course {
    protected NetworkCourse(int courseSize, Trainer trainer) {
        super(courseSize, trainer);
    }

    public String getName() {
        return getTrainer().getName() + "'s Network Course";
    }

    LocalDate courseStart = LocalDate.of(2020, 9, 9);
    LocalDate courseEnd = LocalDate.of(2020, 11, 1);
    Period p = Period.between(courseStart, courseEnd);

    public int getDuration() {
        return p.getDays();
    }

    @Override
    public LocalDate getCourseStart() {
        return courseStart;
    }
}
