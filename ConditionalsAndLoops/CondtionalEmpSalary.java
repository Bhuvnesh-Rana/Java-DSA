package ConditionalsAndLoops;

public class CondtionalEmpSalary {

    public static void main(String[] args) {
        int empSalary=1000;
        if (empSalary>500) {
            empSalary=empSalary+200;
        }
        else{
            empSalary=empSalary+100;
        }
            System.out.println("Emp salary is: "+empSalary);
    
    }
    
}