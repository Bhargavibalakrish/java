import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double[] monthlySalary = new double[3];

    double calculateTotalSalary() {
        double total = 0;
        for (double salary : monthlySalary) {
            total += salary;
        }
        return total;
    }


    double calculateAverageSalary() {
        return calculateTotalSalary() / monthlySalary.length;
    }

    int countVowels() {
        int count = 0;
        String name = empName.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }


    String reverseName() {
        String reversed = "";
        for (int i = empName.length() - 1; i >= 0; i--) {
            reversed += empName.charAt(i);
        }
        return reversed;
    }

    void displayDetails() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println();

        System.out.println("Total Salary : " + (int) calculateTotalSalary());
        System.out.println("Average Salary : " + (int) calculateAverageSalary());
        System.out.println();

        System.out.println("Number of Vowels : " + countVowels());
        System.out.println();

        System.out.println("Reversed Name : " + reverseName());
    }
}

public class Employeemanagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        emp.empId = sc.nextInt();
        sc.nextLine(); // consume newline

        emp.empName = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            emp.monthlySalary[i] = sc.nextDouble();
        }

        emp.displayDetails();

        sc.close();
    }
}