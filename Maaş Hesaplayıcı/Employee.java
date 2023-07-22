public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        return (salary > 1000) ? salary * 0.03 : 0;
    }

    public double bonus() {
        return (workHours > 40) ? (workHours - 40) * 30 : 0;
    }

    public double raiseSalary() {
        int yearsWorked = 2021 - hireYear;
        double raisePercentage = 0;

        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked < 20) {
            raisePercentage = 0.10;
        } else {
            raisePercentage = 0.15;
        }

        return salary * raisePercentage;
    }

    public double totalSalary() {
        return salary - tax() + bonus() + raiseSalary();
    }

    @Override
    public String toString() {
        return "Adı: " + name + "\nMaaşı: " + salary + "\nÇalışma Saati: " + workHours + "\nBaşlangıç Yılı: " + hireYear
                + "\nVergi: " + tax() + "\nBonus: " + bonus() + "\nMaaş Artışı: " + raiseSalary()
                + "\nVergi ve Bonuslar ile birlikte maaş: " + totalSalary() + "\nToplam Maaş: " + (salary + bonus());
    }

    public static void main(String[] args) {
        Employee employee = new Employee("kemal", 2000.0, 45, 1985);
        System.out.println(employee.toString());
    }
}
