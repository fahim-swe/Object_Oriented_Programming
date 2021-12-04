package Inheritance.single;

public class Employee extends Person{
    private String empID;

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public void details(){
        System.out.println(super.getName());
        System.out.println(super.getAge());
        System.out.println(this.getEmpID());
    }
}
