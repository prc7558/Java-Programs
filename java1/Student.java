package java1;

public class Student {
    private int studentID;
    private String name;
    private int[] marks;
    private int numSubs;

    public void setDetails(int id, String name, int[] marks, int n) {
        this.studentID = id;
        this.name = name;
        this.marks = marks;
        this.numSubs = n;
    }

    public double calcAvg() {
        int sum = 0;
        for (int sub : marks) {
            sum += sub;
        }
        return (double) sum / numSubs;
    }

    public String getResult() {
        double avg = calcAvg();
        if (avg<50) return "FAIL";
        for (int sub : marks) {
            if (sub < 40) return "FAIL";
        }
        return "PASS";
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Average Marks: " + calcAvg());
        System.out.println("Result: " + getResult());
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int[] getmarks() {
        return marks;
    }
}