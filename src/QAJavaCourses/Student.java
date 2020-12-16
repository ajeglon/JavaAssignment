package QAJavaCourses;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Student extends Person {

    private Register register;
    private Course[] courses;
    private Set<Class<? extends  Course>> preferredCourses;

    public Student(String name) {
        super(name);
        courses = new Course[2];
        preferredCourses = new HashSet<>();
    }

    public void setPreferredCourses(Class< ? extends Course>... courses) {
        for (Class<? extends Course> course : courses) {
            preferredCourses.add(course);
        }
    }

    public void assignCourse(Course course) {
        for(int i = 0; i < courses.length; i++) {
            if(course == courses[i])
                continue;

            if (courses[i] == null) {
                course.addStudent(this);
                courses[i] = course;
                return;
            }
        }
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public Course[] getCourses() {
        return Arrays.copyOf(courses, courses.length);
    }

    public boolean prefersCourse(Course course) {
        return preferredCourses.contains(course.getClass());
    }
}
