abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void printReceipt() {
        System.out.println("Employee: " + name);
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee {
    double hours, rate;

    PartTimeEmployee(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    double calculateSalary() {
        return hours * rate;
    }
}

class CommissionEmployee extends Employee {
    double sales, percentage;

    CommissionEmployee(String name, double sales, double percentage) {
        super(name);
        this.sales = sales;
        this.percentage = percentage;
    }

    double calculateSalary() {
        return sales * percentage / 100;
    }
}

public class AbstractClassEmployee {
    public static void main(String[] args) {
        Employee[] employees = {
            new FullTimeEmployee("Ravi", 30000),
            new PartTimeEmployee("Asha", 40, 200),
            new CommissionEmployee("Kiran", 50000, 10)
        };

        for (int i = 0; i < employees.length; i++) {
            employees[i].printReceipt();
            System.out.println("Salary = " + employees[i].calculateSalary());
            System.out.println();
        }
    }
}
