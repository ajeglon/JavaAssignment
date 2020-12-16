package QAJavaCourses;

public class Main {
    public static void main(String[] args) {
        Trainer Andrew = new Trainer("Andrew");
        Trainer Charlotte = new Trainer("Charlotte");
        Trainer Keith = new Trainer("Keith");
        Trainer Dean = new Trainer("Dean");


        Course[] courses = {
                new CSharpCourse(3, Andrew),
                new JavaCourse(3, Charlotte),
                new JavaCourse(4,Keith),
                new NetworkCourse(4, Dean)
        };

        Register register = new Register(courses);

        Student James = new Student("James");
        Student Jill = new Student("Jill");
        Student Paul = new Student("Paul");
        Student Hannah = new Student("Hannah");
        Student Lewis = new Student("Lewis");
        Student Simon = new Student("Phil");

        James.setPreferredCourses(JavaCourse.class, CSharpCourse.class);
        Jill.setPreferredCourses(CSharpCourse.class, NetworkCourse.class);
        Paul.setPreferredCourses(NetworkCourse.class, JavaCourse.class);
        Hannah.setPreferredCourses(JavaCourse.class, NetworkCourse.class);
        Lewis.setPreferredCourses(CSharpCourse.class, JavaCourse.class);
        Simon.setPreferredCourses(JavaCourse.class, NetworkCourse.class);

        register.register(James, Jill, Paul, Hannah, Lewis, Simon);

        courseSchedule(register);
    }

    private static void courseSchedule(Register register) {
        System.out.println("QA Student Schedule: ");
        for (Student student : register.getStudents()) {
            if (student != null) {
                String output = student.getName() + " is studying: \n";

                for (Course course : student.getCourses()) {
                    output = output + ("\t" + course.getName());
                    output += " for " + course.getDuration() + " days";
                    output += " starting from " + course.getCourseStart() + "\n";
                }
                System.out.println(output);
            }
        }
        System.out.println("\nCourse Schedule: ");
        for (Course course : register.getCourses()) {
            String output = course.getName() + " is studied by";

            for (Student student : course.getStudents()) {
                if (student != null)
                    output += " - " + student.getName();
            }
            System.out.println(output);
        }
    }
}
