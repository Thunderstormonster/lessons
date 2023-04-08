import position.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class DepartmentManager {
    public static void changeDepartment(Employee employee) {

        Scanner in = new Scanner(System.in);

        Department department;
        Position position = null;

        System.out.println("Witch department do you wanna transfer employee? ");
        if (employee.getPosition() instanceof Trainee || employee.getPosition() instanceof Specialist || employee.getPosition() instanceof HeadOfMarketing) {
            System.out.println(Department.HR);
            System.out.println(Department.DEVELOPMENT);
        } else if (employee.getPosition() instanceof Manager || employee.getPosition() instanceof SeniorManager || employee.getPosition() instanceof HeadOfHR) {
            System.out.println(Department.MARKETING);
            System.out.println(Department.DEVELOPMENT);
        } else {
            System.out.println(Department.HR);
            System.out.println(Department.MARKETING);
        }
        department = Department.valueOf(in.next());



        if(department==Department.HR){
            System.out.println("Available positions: Manager, SeniorManager, HeadOfHr; ");
            System.out.println("What position do you wanna set your employee? ");
            switch (in.next()){
                case "Manager":employee.setPosition(new Manager());
                    employee.setSalary(new Manager().getMinSalary());
                    break;
                case "SeniorManager":employee.setPosition(new SeniorManager());
                    employee.setSalary(new SeniorManager().getMinSalary());
                    break;
                case "HeadOfHr":employee.setPosition(new HeadOfHR());
                    employee.setSalary(new HeadOfHR().getMinSalary());
                    break;
                default: System.out.println("No such position");
                    break;
            }
        }else if(department==Department.MARKETING){
            System.out.println("Available positions: Trainee, Specialist, HeadOfMarketing; ");
            System.out.println("What position do you wanna set your employee? ");
            switch (in.next()){
                case "Trainee":employee.setPosition(new Trainee());
                    employee.setSalary(new Trainee().getMinSalary());
                    break;
                case "Specialist":employee.setPosition(new Specialist());
                    employee.setSalary(new Specialist().getMinSalary());
                    break;
                case "HeadOfMarketing":employee.setPosition(new HeadOfMarketing());
                    employee.setSalary(new HeadOfMarketing().getMinSalary());
                    break;
                default: System.out.println("No such position");
                    break;
            }
        }else if(department==Department.DEVELOPMENT){
            System.out.println("Available positions: JuniorDeveloper, MiddleDeveloper, SeniorDeveloper, TeamLead; ");
            System.out.println("What position do you wanna set your employee? ");
            switch (in.next()){
                case "TeamLead":employee.setPosition(new TeamLead());
                    employee.setSalary(new TeamLead().getMinSalary());
                    break;
                case "SeniorDeveloper":employee.setPosition(new SeniorDeveloper());
                    employee.setSalary(new SeniorDeveloper().getMinSalary());
                    break;
                case "MiddleDeveloper":employee.setPosition(new MiddleDeveloper());
                    employee.setSalary(new MiddleDeveloper().getMinSalary());
                    break;
                case "JuniorDeveloper":employee.setPosition(new JuniorDeveloper());
                    employee.setSalary(new JuniorDeveloper().getMinSalary());
                    break;
                default: System.out.println("No such position");
                    break;
            }
        }





    }
}
