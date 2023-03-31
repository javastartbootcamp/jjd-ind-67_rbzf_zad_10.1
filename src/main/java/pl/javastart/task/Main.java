package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        System.out.println("Podaj informacje o 3 roznych uczniach:");

        for (int i = 0; i < students.length; i++) {
            students[i] = createStudent(sc);
            if (compareStudents(i, students[i], students)) {
                i--;
            }
        }
        System.out.println("Obiekty zapisane w tablcy:");
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    private static Student createStudent(Scanner sc) {

        System.out.println("Podaj imie ucznia:");
        String firstName = sc.nextLine();
        System.out.println("Podaj nazwisko ucznia:");
        String lastName = sc.nextLine();
        System.out.println("Podaj wiek ucznia:");
        int age = sc.nextInt();
        sc.nextLine();

        return new Student(firstName, lastName, age);
    }

    private static boolean compareStudents(int i, Student student, Student[] students) {
        boolean duplicate = false;
        for (int j = 0; j < i; j++) {
            if (student.equals(students[j])) {
                System.out.println("Duplikat");
                duplicate = true;
                break;
            }
        }
        return duplicate;
    }
}

