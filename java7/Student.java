package java7;

public class Student {

    private int id;
    private String name;
    private int age;
    private String grade;

    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // ~~~ GET METHODS ~~~
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
    
    // ~~~ SET METHODS ~~~
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    // Convert object to file format 
    public String toFileString() {
        return id + "," + name + "," + age + "," + grade;
    }
    
    // Display Record
    public void display() {
        System.out.println(id + " | " + name + " | " + age + " | " + grade);
    }
}