import position.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

public class DepartmentManager {

    static Map<Department,ArrayList<Position>> departmentPositions=new HashMap<>();
    //indexof()==-1??


    static Position[] marketing=new Position[]{new Trainee(),new Specialist(),new HeadOfMarketing()};
    static Position[] hr=new Position[]{new Manager(),new SeniorManager(),new HeadOfHR()};
    static Position[] development=new Position[]{new JuniorDeveloper(),new MiddleDeveloper(),new SeniorDeveloper(),new TeamLead()};


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

    public static void raisePosition(Employee employee){
        Scanner in=new Scanner(System.in);

        /*ArrayList<Position> marketing=new ArrayList<Position>();
        //(Arrays.asList(new Trainee(),new Specialist(),new HeadOfMarketing()))
        marketing.add(new Trainee());
        marketing.add(new Specialist());
        marketing.add(new HeadOfMarketing());
        departmentPositions.put(Department.MARKETING,marketing);
        //departmentPositions.put(Department.MARKETING,"Specialist");
        //departmentPositions.put(Department.MARKETING,"HeadOfMarketing");
        departmentPositions.put(Department.HR,new ArrayList<Position>(Arrays.asList(new Manager(),new SeniorManager(),new HeadOfMarketing())));
        //departmentPositions.put(Department.HR,"SeniorManager");
        //departmentPositions.put(Department.HR,"HeadOfHR");

        Position employeePosition = employee.getPosition();
        Department employeeDepartment = employeePosition.getDepartment();


        System.out.print(departmentPositions.get(employeeDepartment).get(departmentPositions.get(employeeDepartment).indexOf(cl)));

       /*if(departmentPositions.get(employeeDepartment).get(departmentPositions.get(employeeDepartment).size()-1).getClass().equals(employeePosition.getClass())){
           System.out.println("You can't give a raise to this employee. He is already on the highest position");
       }else {
           //System.out.print(employeePosition);
           //System.out.print(departmentPositions.get(employeeDepartment).get(departmentPositions.get(employeeDepartment).indexOf(employeePosition)));
           Position nextPosition=departmentPositions.get(employeeDepartment).get(departmentPositions.get(employeeDepartment).);
           //System.out.print(nextPosition);
           System.out.println("What salary do you wanna set?(" + nextPosition.getMinSalary() + "-" + nextPosition.getMaxSalary() + ")");
           int salary = in.nextInt();
           employee.setPosition(nextPosition);
           Accounting.changeSalary(employee, BigDecimal.valueOf(salary));
       }*/

        if(employee.getPosition().getDepartment().equals(Department.HR)){
            if(employee.getPosition().getClass().equals(hr[hr.length-1].getClass())){
                System.out.println("You can't give a raise to this employee. He is already on the highest position");
            }else {
                for (int i = 0; i < hr.length-1; i++) {
                    if (employee.getPosition().getClass().equals(hr[i].getClass())) {
                        i++;
                        System.out.println("What salary do you wanna set?(" + hr[i].getMinSalary() + "-" + hr[i].getMaxSalary() + ")");
                        int salary = in.nextInt();
                        hr[i].setDepartment(Department.HR);
                        employee.setPosition(hr[i]);
                        Accounting.changeSalary(employee, BigDecimal.valueOf(salary));
                    }
                }
            }
        }else if(employee.getPosition().getDepartment().equals(Department.MARKETING)){
            if(employee.getPosition().getClass().equals(marketing[marketing.length-1].getClass())){
                System.out.println("You can't give a raise to this employee. He is already on the highest position");
            }else {
                for (int i = 0; i < marketing.length; i++) {
                    if (employee.getPosition().getClass().equals(marketing[i].getClass())) {
                        i++;
                        System.out.println("What salary do you wanna set?(" + marketing[i].getMinSalary() + "-" + marketing[i].getMaxSalary() + ")");
                        int salary = in.nextInt();
                        marketing[i].setDepartment(Department.MARKETING);
                        employee.setPosition(marketing[i]);
                        Accounting.changeSalary(employee, BigDecimal.valueOf(salary));
                    }
                }
            }
        } else if(employee.getPosition().getDepartment().equals(Department.DEVELOPMENT)){
            if(employee.getPosition().getClass().equals(development[development.length-1].getClass())){
                System.out.println("You can't give a raise to this employee. He is already on the highest position");
            }else {
                for (int i = 0; i < development.length-1; i++) {
                    if (employee.getPosition().getClass().equals(development[i].getClass())) {
                        i++;
                        System.out.println("What salary do you wanna set?(" + development[i].getMinSalary() + "-" + development[i].getMaxSalary() + ")");
                        int salary = in.nextInt();
                        development[i].setDepartment(Department.DEVELOPMENT);
                        employee.setPosition(development[i]);
                        Accounting.changeSalary(employee, BigDecimal.valueOf(salary));
                    }
                }
            }
        }
    }
    public static void lowerPosition(Employee employee){
        Scanner in=new Scanner(System.in);
        if(employee.getPosition().getDepartment().equals(Department.HR)){
            if(employee.getPosition().getClass().equals(hr[0].getClass())){
                System.out.println("Employee is fired");
                FileManager.employees.remove(employee);
            }else {
                for (int i = 0; i < hr.length-1; i++) {
                    if (employee.getPosition().getClass().equals(hr[i].getClass())) {
                        i--;
                        System.out.println("What salary do you wanna set?(" + hr[i].getMinSalary() + "-" + hr[i].getMaxSalary() + ")");
                        int salary = in.nextInt();
                        hr[i].setDepartment(Department.HR);
                        employee.setPosition(hr[i]);
                        Accounting.changeSalary(employee, BigDecimal.valueOf(salary));
                    }
                }
            }
        }else if(employee.getPosition().getDepartment().equals(Department.MARKETING)){
            if(employee.getPosition().getClass().equals(marketing[0].getClass())){
                System.out.println("Employee is fired");
                FileManager.employees.remove(employee);
            }else {
                for (int i = 0; i < marketing.length; i++) {
                    if (employee.getPosition().getClass().equals(marketing[i].getClass())) {
                        i--;
                        System.out.println("What salary do you wanna set?(" + marketing[i].getMinSalary() + "-" + marketing[i].getMaxSalary() + ")");
                        int salary = in.nextInt();
                        marketing[i].setDepartment(Department.MARKETING);
                        employee.setPosition(marketing[i]);
                        Accounting.changeSalary(employee, BigDecimal.valueOf(salary));
                    }
                }
            }
        } else if(employee.getPosition().getDepartment().equals(Department.DEVELOPMENT)){
            if(employee.getPosition().getClass().equals(development[0].getClass())){
                System.out.println("Employee is fired");
                FileManager.employees.remove(employee);
            }else {
                for (int i = 0; i < development.length-1; i++) {
                    if (employee.getPosition().getClass().equals(development[i].getClass())) {
                        i--;
                        System.out.println("What salary do you wanna set?(" + development[i].getMinSalary() + "-" + development[i].getMaxSalary() + ")");
                        int salary = in.nextInt();
                        development[i].setDepartment(Department.DEVELOPMENT);
                        employee.setPosition(development[i]);
                        Accounting.changeSalary(employee, BigDecimal.valueOf(salary));
                    }
                }
            }
        }
    }
}
