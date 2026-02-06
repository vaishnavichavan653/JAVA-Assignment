class Sort{
    public static void main(String []args){
        int a[] ={9,3,4,5,2,1,6,8,7,0};
        int temp;
        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("sorted numbers:");
        for(int i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
    }
}





public class Employee {
    // Instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    // Setter and Getter for First Name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // Setter and Getter for Last Name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    // Setter and Getter for Monthly Salary
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0)
            this.monthlySalary = monthlySalary;
        else
            this.monthlySalary = 0.0;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Method to calculate yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}
