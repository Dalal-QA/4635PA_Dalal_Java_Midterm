package company_app_design;

import java.sql.SQLOutput;

public class CompanyEmployee {

    /** INSTRUCTIONS
     *
     *  This class has a main method where you will be able to create instances of the EmployeeInfo class in order
     *  to use attributes and methods.
     *
     *  Demonstrate as many methods as possible here. Feel free to show off what you've learned so far.
     *
     *  The goal of this application is to provide basic employee information services
     *  Try to think like a Software Developer
     */
    public static void main(String[] args) {
    EmployeeInfo employeeInfo= new EmployeeInfo(1254874521,"3001 Carlisle st" );
        System.out.println( employeeInfo.getEmployeeAddress());
        employeeInfo.setEmployeeAddress("124 Porter street");


        //calculate annual bonus
        System.out.println("This employee has Annual bonus of: " + EmployeeInfo.calculateAnnualBonus(6200,2));
        //Calculate the net salary
        EmployeeInfo emp1 = new EmployeeInfo("Dalal",  458547, 50000.00);
        System.out.println("Employee name is: " + emp1.getEmployeeName());
        System.out.println("Employee Id is: " + emp1.getEmployeeId());
        System.out.println("Employee gross salary is: " + emp1.getGrossSalary());
        double netSalary =emp1.calculateNetSalary(50000,0.2,5000);
        System.out.println("Net salary:" + netSalary);

       // calculate employee pension
        int pension = EmployeeInfo.calculateEmployeePension();
        System.out.println("The employee pension is: " + pension);
        //The number of the years
        int years= EmployeeInfo.getNumberOfYears("May,2011","August,2023");
        System.out.println("The number of the years is:" + years);

    }

}
