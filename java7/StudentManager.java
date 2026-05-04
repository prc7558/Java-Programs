package java7;

import java.io.*;
import java.util.*;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();
    private final String fileName = "students.txt";
    private final String csvFileName = "students.csv";
    
    // ~~~ Load File ~~~
    public void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                String grade = data[3];

                students.add(new Student(id, name, age, grade));
            }

        } catch (IOException e) {
            System.out.println("No existing file found. Starting fresh.");
        }
    }

    // Save data to file
    public void saveToFile() {
        try (
            BufferedWriter txtWriter = new BufferedWriter(new FileWriter(fileName));
            BufferedWriter csvWriter = new BufferedWriter(new FileWriter(csvFileName))
        ) {

            for (Student s : students) {
                String data = s.toFileString();

                txtWriter.write(data);
                txtWriter.newLine();
                
                csvWriter.write(data);
                csvWriter.newLine();
            }

            System.out.println("Data saved to TXT and CSV");

        } catch (IOException e) {
            System.out.println("Error saving data!");
        }
    }
    
    // Add student
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added");
    }
    
    // Delete student
    public void deleteStudent(int id) {
        Iterator<Student> it = students.iterator();

        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                System.out.println("Student deleted");
                return;
            }
        }

        System.out.println("Student not found");
    }
    
    // Search student
    public void searchByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                s.display();
                return;
            }
        }
        System.out.println("Student not found");
    }
    
    // Update student
    public void updateStudent(int id, String newName, int newAge, String newGrade) {
        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(newName);
                s.setAge(newAge);
                s.setGrade(newGrade);
                System.out.println("Student updated successfully");
                return;
            }
        }
        System.out.println("Student not found");
    }

    // View students
    public void viewStudents() {

        try (BufferedReader br = new BufferedReader(new FileReader(csvFileName))) {

            String line;

            System.out.println("\nID | Name | Age | Grade");
            System.out.println("-------------------------");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                System.out.println(
                    data[0] + " | " +
                    data[1] + " | " +
                    data[2] + " | " +
                    data[3]
                );
            }

        } catch (IOException e) {
            System.out.println("Error reading file or file not found");
        }
    }
}