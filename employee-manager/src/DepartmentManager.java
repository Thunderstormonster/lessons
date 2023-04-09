import position.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
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
                    employee.setSalary(employee.getPosition().getMinSalary());
                    break;
                case "SeniorManager":employee.setPosition(new SeniorManager());
                    employee.setSalary(employee.getPosition().getMinSalary());
                    break;
                case "HeadOfHr":employee.setPosition(new HeadOfHR());
                    employee.setSalary(employee.getPosition().getMinSalary());
                    break;
                default: System.out.println("No such position");
                    break;
            }
        }else if(department==Department.MARKETING){
            System.out.println("Available positions: Trainee, Specialist, HeadOfMarketing; ");
            System.out.println("What position do you wanna set your employee? ");
            switch (in.next()){
                case "Trainee":employee.setPosition(new Trainee());
                    employee.setSalary(employee.getPosition().getMinSalary());
                    break;
                case "Specialist":employee.setPosition(new Specialist());
                    employee.setSalary(employee.getPosition().getMinSalary());
                    break;
                case "HeadOfMarketing":employee.setPosition(new HeadOfMarketing());
                    employee.setSalary(employee.getPosition().getMinSalary());
                    break;
                default: System.out.println("No such position");
                    break;
            }
        }else if(department==Department.DEVELOPMENT){
            System.out.println("Available positions: JuniorDeveloper, MiddleDeveloper, SeniorDeveloper, TeamLead; ");
            System.out.println("What position do you wanna set your employee? ");
            switch (in.next()){
                case "TeamLead":employee.setPosition(new TeamLead());
                    employee.setSalary(employee.getPosition().getMinSalary());
                    break;
                case "SeniorDeveloper":employee.setPosition(new SeniorDeveloper());
                    employee.setSalary(employee.getPosition().getMinSalary());
                    break;
                case "MiddleDeveloper":employee.setPosition(new MiddleDeveloper());
                    employee.setSalary(employee.getPosition().getMinSalary());
                    break;
                case "JuniorDeveloper":employee.setPosition(new JuniorDeveloper());
                    employee.setSalary(employee.getPosition().getMinSalary());
                    break;
                default: System.out.println("No such position");
                    break;
            }
        }
    }
    //2. Добавь в класс DepartmentManager 2 новых метода:
    // raisePosition и lowerPosition, которые ничего не возвращают
    // и принимают в параметрах сотрудника, которого нужно повысить/понизить.
    // Эти методы должны назначить пользователю новую позицию
    // в соответствии с изначальными условиями. После назначения,
    // этот метод должен спросить у пользователя в консоли какую
    // зарплату назначить сотруднику на новой позиции, введенную
    // зарплату и объект самого сотрудника нужно передать в метод
    // changeSalary класса Accounting.
    public static void raisePosition(Employee employee){
        BigDecimal salary;

        Scanner in=new Scanner(System.in);
        if(employee.getPosition() instanceof Trainee){
            employee.setPosition(new Specialist());
            System.out.println("What salary do you wanna set?(500-1200)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof Specialist){
            employee.setPosition(new HeadOfMarketing());
            System.out.println("What salary do you wanna set?(1000-2000)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof HeadOfMarketing){
            System.out.println("You can't give a raise to this employee. He is already on the highest position");
        }else if(employee.getPosition() instanceof Manager){
            employee.setPosition(new SeniorManager());
            System.out.println("What salary do you wanna set?(700-1100)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof SeniorManager){
            employee.setPosition(new HeadOfHR());
            System.out.println("What salary do you wanna set?(800-1700)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof HeadOfHR){
            System.out.println("You can't give a raise to this employee. He is already on the highest position");
        }else if(employee.getPosition() instanceof JuniorDeveloper){
            employee.setPosition(new MiddleDeveloper());
            System.out.println("What salary do you wanna set?(800-2000)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof MiddleDeveloper){
            employee.setPosition(new SeniorDeveloper());
            System.out.println("What salary do you wanna set?(1800-4000)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof SeniorDeveloper){
            employee.setPosition(new TeamLead());
            System.out.println("What salary do you wanna set?(2500-7000)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof TeamLead){
            System.out.println("You can't give a raise to this employee. He is already on the highest position");
        }
    }
    public static void lowerPosition(Employee employee){
        BigDecimal salary;

        Scanner in=new Scanner(System.in);
        if(employee.getPosition() instanceof Trainee){
            System.out.println("You can't lower this position");
        }else if(employee.getPosition() instanceof Specialist){
            employee.setPosition(new Trainee());
            System.out.println("What salary do you wanna set?(300-600)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof HeadOfMarketing){
            employee.setPosition(new Specialist());
            System.out.println("What salary do you wanna set?(500-1200)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof Manager){
            System.out.println("You can't lower this position");
        }else if(employee.getPosition() instanceof SeniorManager){
            employee.setPosition(new Manager());
            System.out.println("What salary do you wanna set?(400-800)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof HeadOfHR){
            employee.setPosition(new SeniorManager());
            System.out.println("What salary do you wanna set?(700-1100)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof JuniorDeveloper){
            System.out.println("You can't lower this position");
        }else if(employee.getPosition() instanceof MiddleDeveloper){
            employee.setPosition(new JuniorDeveloper());
            System.out.println("What salary do you wanna set?(400-1000)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof SeniorDeveloper){
            employee.setPosition(new MiddleDeveloper());
            System.out.println("What salary do you wanna set?(800-2000)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }else if(employee.getPosition() instanceof TeamLead){
            employee.setPosition(new SeniorDeveloper());
            System.out.println("What salary do you wanna set?(1800-4000)");
            int i=in.nextInt();
            salary=BigDecimal.valueOf(i);
            Accounting.changeSalary(employee,salary);
        }
    }
}
