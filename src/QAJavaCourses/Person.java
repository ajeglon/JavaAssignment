package QAJavaCourses;

public abstract class Person {
    private String name;

    protected Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
