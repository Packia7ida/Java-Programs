class Employee {

    private String name;
    private int age;
    private String department;

    public Employee(String name, int age, String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }

    public void displayEmpDetails(){
        System.out.println("Employee Name      :"+name);
        System.out.println("Employee Age       :"+age);
        System.out.println("Employee Department:"+department);
    }
}
class SalarySlip extends Employee{
    private double basicSalary;
    private double hra;
    private double da;
    private double deductions;

    public SalarySlip(String name,int age, String department,double basicSalary,double hra,double da,double deductions){
        super(name, age, department);
        this.basicSalary=basicSalary;
        this.hra=hra;
        this.da=da;
        this.deductions=deductions;
    }

    public double calculateNetSalary(){
        return basicSalary+hra+da-deductions;
    }

    public void salaryDetails(){
        displayEmpDetails();
        System.out.println("Basic Salary       :"+basicSalary);
        System.out.println("HRA                :"+hra);
        System.out.println("DA                 :"+da);
        System.out.println("Deductions         :"+deductions);
        System.out.println("Net Salary         :"+calculateNetSalary());
    }
}

public class MainProgram {
    public static void main(String args[]) {
        SalarySlip[] employees=new SalarySlip[2];
        employees[0] = new SalarySlip("Isaac Paul",58,"Java",30000, 8000, 5000, 2000);
        employees[1]= new SalarySlip("Irin Mathew",25,"Testing",35000, 10000, 8000, 7000);
        System.out.println("-----------------------------------");
        for(int i=0;i< employees.length;i++){
            System.out.println("Employee "+(i+1)+":");
            System.out.println("-----------------------------------");
            employees[i].salaryDetails();
            System.out.println("-----------------------------------");
        }
    }
}
