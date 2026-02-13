class Employe {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;

    public Employe(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10;  
    }

    public void performanceReport() {
        System.out.println("Performance Report of " + name + ": Excellent");
    }

    public void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Manager extends Employe {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }
}

class Developer extends Employe {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }
}

class Programmer extends Employe {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }
}

public class Employee1 {
    public static void main(String[] args) {
        Manager m = new Manager("Amit", "Mumbai", 80000);
        Developer d = new Developer("Riya", "Pune", 60000);
        Programmer p = new Programmer("Rahul", "Delhi", 50000);

        System.out.println("Manager Bonus: " + m.calculateBonus());
        d.performanceReport();
        p.manageProject();
    }
}
