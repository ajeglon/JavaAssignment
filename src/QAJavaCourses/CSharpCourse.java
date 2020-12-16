package QAJavaCourses;

import java.time.LocalDate;
import java.time.Period;

public class CSharpCourse extends Course {
    protected CSharpCourse(int courseSize, Trainer trainer) {
        super(courseSize, trainer);
    }

    public String getName() {
        return getTrainer().getName() + "'s C# Course";
    }

    LocalDate courseStart = LocalDate.of(2021, 3, 15);
    LocalDate courseEnd = LocalDate.of(2021, 3, 29);
    Period p = Period.between(courseStart, courseEnd);

    public int getDuration() {
        return p.getDays();
    }

    @Override
    public LocalDate getCourseStart() {
        return courseStart;
    }
}
