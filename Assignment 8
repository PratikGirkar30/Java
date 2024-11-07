import java.io.*;
import java.util.*;

class Student {
    String studentId;
    String name;
    String rollNo;
    String className;
    int marks;
    String address;

    public Student(String studentId, String name, String rollNo, String className, int marks, String address) {
        this.studentId = studentId;
        this.name = name;
        this.rollNo = rollNo;
        this.className = className;
        this.marks = marks;
        this.address = address;
    }

    public String display() {
        return studentId + "," + name + "," + rollNo + "," + className + "," + marks + "," + address;
    }
}

class StudentDatabase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Create Database");
            System.out.println("2. Display Database");
            System.out.println("3. Delete Record");
            System.out.println("4. Update Record");
            System.out.println("5. Search Record");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    createDatabase();
                    break;
                case 2:
                    displayDatabase();
                    break;
                case 3:
                    deleteRecord();
                    break;
                case 4:
                    updateRecord();
                    break;
                case 5:
                    searchRecord();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }

        }

    }

    static void createDatabase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        String studentId = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No: ");
        String rollNo = sc.nextLine();
        System.out.print("Enter Class: ");
        String className = sc.nextLine();
        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        Student student = new Student(studentId, name, rollNo, className, marks, address);
        try (FileWriter fileWriter = new FileWriter("students.txt", true)) {
            fileWriter.write(student.display() + "\n");
            System.out.println("Student record created successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        sc.close();
    }

    static void displayDatabase() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            System.out.println("\nStudent Records:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    static void deleteRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID to delete: ");
        String studentId = sc.nextLine();
        List<Student> students = new ArrayList<>();
        boolean found = false;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                if (!data[0].equals(studentId)) {
                    students.add(new Student(data[0], data[1], data[2], data[3], Integer.parseInt(data[4]), data[5]));
                } else {
                    found = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        if (found) {
            try (FileWriter fileWriter = new FileWriter("students.txt")) {
                for (Student student : students) {
                    fileWriter.write(student.display() + "\n");
                }
                System.out.println("Record deleted successfully.");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        } else {
            System.out.println("Student ID not found.");
        }
        sc.close();
    }

    static void updateRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID to update: ");
        String studentId = sc.nextLine();
        List<Student> students = new ArrayList<>();
        boolean found = false;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(studentId)) {
                    found = true;
                    System.out.print("Enter new Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter new Roll No: ");
                    String rollNo = sc.nextLine();
                    System.out.print("Enter new Class: ");
                    String className = sc.nextLine();
                    System.out.print("Enter new Marks: ");
                    int marks = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Address: ");
                    String address = sc.nextLine();

                    students.add(new Student(studentId, name, rollNo, className, marks, address));
                } else {
                    students.add(new Student(data[0], data[1], data[2], data[3], Integer.parseInt(data[4]), data[5]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        if (found) {
            try (FileWriter fileWriter = new FileWriter("students.txt")) {
                for (Student student : students) {
                    fileWriter.write(student.display() + "\n");
                }
                System.out.println("Record updated successfully.");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        } else {
            System.out.println("Student ID not found.");
        }
        sc.close();
    }

    static void searchRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID to search: ");
        String studentId = sc.nextLine();
        boolean found = false;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(studentId)) {
                    System.out.println("Record found: " + line);
                    found = true;
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        if (!found) {
            System.out.println("Student ID not found.");
        }
        sc.close();
    }
}
