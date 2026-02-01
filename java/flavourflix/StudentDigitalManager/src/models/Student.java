package models;

import java.io.*;

public class Student {

    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // WRITE DATA
    private void writeToFile(String fileName, String data) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(data + "\n");
        } catch (IOException e) {
            System.out.println("Error writing data");
        }
    }

    public void addAcademicTask(String task) {
        writeToFile("data/academic.txt", task);
    }

    public void addCodingTask(String task) {
        writeToFile("data/coding.txt", task);
    }

    public void addCommunication(String task) {
        writeToFile("data/communication.txt", task);
    }

    public void addLearningTopic(String topic) {
        writeToFile("data/learning.txt", topic);
    }

    // READ DATA
    private void readFromFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (IOException e) {
            System.out.println("No data found.");
        }
    }

    public void showSummary() {
        System.out.println("\n===== STUDENT SUMMARY =====");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);

        System.out.println("\nAcademic Work:");
        readFromFile("data/academic.txt");

        System.out.println("\nCoding Work:");
        readFromFile("data/coding.txt");

        System.out.println("\nCommunication:");
        readFromFile("data/communication.txt");

        System.out.println("\nLearning Topics:");
        readFromFile("data/learning.txt");
    }
}
