class Employee {
    String empName;
    String empId;
    String address;
    String mailId;
    String mobileNo;
    public Employee(String empName, String empId, String address, String mailId, String mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No: " + mobileNo);
    }
}
class Programmer extends Employee {
    double basicPay;
    public Programmer(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }
    public double calculateGrossSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        return basicPay + da + hra - pf - staffClubFund;
    }
    public double calculateNetSalary() {
        return calculateGrossSalary() - (0.12 * basicPay); 
    }
    public void generatePaySlip() {
        displayDetails();
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
        System.out.println("Net Salary: $" + calculateNetSalary());
        System.out.println("---------------------------");
    }
}
class TeamLead extends Employee {
    double basicPay;
    public TeamLead(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }
    public double calculateGrossSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        return basicPay + da + hra - pf - staffClubFund;
    }
    public double calculateNetSalary() {
        return calculateGrossSalary() - (0.12 * basicPay);
    }
    public void generatePaySlip() {
        displayDetails();
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
        System.out.println("Net Salary: $" + calculateNetSalary());
        System.out.println("---------------------------");
    }
}
class AssistantProjectManager extends Employee {
     double basicPay;
    public AssistantProjectManager(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }
    public double calculateGrossSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        return basicPay + da + hra - pf - staffClubFund;
    }
    public double calculateNetSalary() {
        return calculateGrossSalary() - (0.12 * basicPay);
    }
    public void generatePaySlip() {
        displayDetails();
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
        System.out.println("Net Salary: $" + calculateNetSalary());
        System.out.println("---------------------------");
    }
}
class ProjectManager extends Employee {
   double basicPay;
    public ProjectManager(String empName, String empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }
    public double calculateGrossSalary() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        return basicPay + da + hra - pf - staffClubFund;
    }
    public double calculateNetSalary() {
        return calculateGrossSalary() - (0.12 * basicPay);
    }
    public void generatePaySlip() {
        displayDetails();
        System.out.println("Basic Pay: $" + basicPay);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
        System.out.println("Net Salary: $" + calculateNetSalary());
        System.out.println("---------------------------");
    }
}
public class EmployeePaySlipDemo {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Pratik", "P001", "Nashik", "pratik.girkar30@gmail.com", "1234567890", 5000);
        TeamLead teamLead = new TeamLead("ABC", "T001", "Nashik", "abc@example.com", "0987654321", 7000);
        AssistantProjectManager apm = new AssistantProjectManager("PQR", "APM001", "Pune", "pqr@example.com", "1122334455", 8000);
        ProjectManager pm = new ProjectManager("XYZ", "PM001", "Mumbai", "xyz@example.com", "6677889900", 10000);
        programmer.generatePaySlip();
        teamLead.generatePaySlip();
        apm.generatePaySlip();
        pm.generatePaySlip();
    }
}
