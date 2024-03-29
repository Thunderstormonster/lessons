import position.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManage {

    public static int showMenu(){
        System.out.println("10. Employee of the highest positions");
        System.out.println("9. Sort by salary;");
        System.out.println("8. Group all employee by department;");
        System.out.println("7. Lower employees position;");
        System.out.println("6. Give a raise to the employee;");
        System.out.println("5. Change employee salary;");
        System.out.println("4. Change department;");
        System.out.println("3. Remove employee;");
        System.out.println("2. Create new employee;");
        System.out.println("1. Print all employees;");
        System.out.println("0. Exit.");

        Scanner num=new Scanner(System.in);

        return num.nextInt();
    }
    public static void highestEmployees(List<Employee> employees){
        Stream<Employee> employeeStream= employees.stream();

        List<Employee> map=employeeStream
                .filter(employee -> employee.getPosition().getClass().equals(HeadOfHR.class)||employee.getPosition().getClass().equals(HeadOfMarketing.class)||employee.getPosition().getClass().equals(TeamLead.class))
                .collect(Collectors.toList());
        System.out.println(map);

    }


    public static void sortEmployeeBySalary(List<Employee> employees){
        Stream<Employee> employeeStream= employees.stream();

        List<Employee> map=employeeStream.sorted((x,y)->
                y.getSalary().compareTo(x.getSalary()))
                .collect(Collectors.toList());
        System.out.println(map);

    }

    public static void groupEmployee(List<Employee> employees){
        Map<Department,List<Employee>> map=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        for(Map.Entry<Department,List<Employee>> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+Arrays.toString(entry.getValue().toArray()));
        }

    }

    public static void createEmployee() throws NullPointerException{
        Scanner in=new Scanner(System.in);

        String name;
        String surname;
        int id;
        Position position;
        String dateOfEmployment;
        BigDecimal salary;
        String lastChangeOfSalary=null;
        Employee employee=null;

        System.out.println("1.Enter a name of the employee: ");
        name=in.nextLine();
        System.out.println("2.Enter surname of the employee: ");
        surname=in.nextLine();
        //[150,400)
        id=150+(int)Math.random()*250;
        dateOfEmployment=new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        System.out.println("3.Enter employee position: ");
        switch (in.next()){
            case "Trainee":employee=new Employee(name,surname,id,new Trainee(Department.MARKETING),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "TeamLead":employee=new Employee(name,surname,id,new TeamLead(Department.DEVELOPMENT),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "Specialist":employee=new Employee(name,surname,id,new Specialist(Department.MARKETING),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "SeniorManager":employee=new Employee(name,surname,id,new SeniorManager(Department.HR),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "SeniorDeveloper":employee=new Employee(name,surname,id,new SeniorDeveloper(Department.DEVELOPMENT),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "MiddleDeveloper":employee=new Employee(name,surname,id,new MiddleDeveloper(Department.DEVELOPMENT),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "Manager":employee=new Employee(name,surname,id,new Manager(Department.HR),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "JuniorDeveloper":employee=new Employee(name,surname,id,new JuniorDeveloper(Department.DEVELOPMENT),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "HeadOfMarketing":employee=new Employee(name,surname,id,new HeadOfMarketing(Department.MARKETING),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            case "HeadOfHr":employee=new Employee(name,surname,id,new HeadOfHR(Department.HR),dateOfEmployment,BigDecimal.valueOf(0), null);
            break;
            default: System.out.println("No such position");
            break;
        }
        System.out.println("4.Enter employee start salary: ");
        employee.setSalary(BigDecimal.valueOf(in.nextInt()));

        FileManager.addEmployee(employee);
    }

    public static void removeEmployee(){
        for(int i=0;i<FileManager.employees.size();i++){
            System.out.println(i+". "+FileManager.employees.get(i).toString());
        }

        Scanner in=new Scanner(System.in);

        int id;
        Employee removedEmployee;

        System.out.println("Enter a number of thr employee to fire him: ");
        id=in.nextInt();

        for (int i=0;i<FileManager.employees.size();i++){
            if(id==i){
                removedEmployee=FileManager.employees.get(i);
                FileManager.removeEmployee(removedEmployee);
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileManager.readEmployee();
        //FileManager.addEmployee(new Employee("Timothy","Dalton",192,new HeadOfMarketing(Department.MARKETING),"12/02/2000", BigDecimal.valueOf(300),"25/12/2022"));
        //FileManager.addEmployee(new Employee("Anna","May",188,new Specialist(Department.MARKETING),"02/03/2010", BigDecimal.valueOf(900),"23/05/2015"));

        Scanner in=new Scanner(System.in);

        do{
            switch (showMenu()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    FileManager.employees.forEach((n)->System.out.println(n.toString()));
                    break;
                case 2:
                    EmployeeManage.createEmployee();
                    FileManager.saveEmployee(FileManager.employees);
                    break;
                case 3:
                    EmployeeManage.removeEmployee();
                    FileManager.saveEmployee(FileManager.employees);
                    break;
                case 4:
                    for(int i=0;i<FileManager.employees.size();i++){
                        System.out.println(i+". "+FileManager.employees.get(i).toString());
                    }
                    System.out.println("What employee do you wanna transfer? ");
                    int id=in.nextInt();
                    DepartmentManager.changeDepartment(FileManager.employees.get(id));
                    FileManager.saveEmployee(FileManager.employees);
                    break;
                case 5:
                    for(int i=0;i<FileManager.employees.size();i++){
                        System.out.println(i+". "+FileManager.employees.get(i).toString());
                    }
                    System.out.println("What employee do you wanna change salary? ");
                    int i2=in.nextInt();
                    System.out.println("What salary do you want to set? ("+FileManager.employees.get(i2).getPosition().getMinSalary()+"-"+FileManager.employees.get(i2).getPosition().getMaxSalary()+")");
                    int salary=in.nextInt();
                    Accounting.changeSalary(FileManager.employees.get(i2),BigDecimal.valueOf(salary));
                    FileManager.saveEmployee(FileManager.employees);
                    break;
                case 6:
                    for(int i=0;i<FileManager.employees.size();i++){
                    System.out.println(i+". "+FileManager.employees.get(i).toString());
                    }
                    System.out.println("What employee do you wanna give a raise? ");
                    int i3=in.nextInt();
                    DepartmentManager.raisePosition(FileManager.employees.get(i3));
                    FileManager.saveEmployee(FileManager.employees);
                    break;
                case 7:
                    for(int i=0;i<FileManager.employees.size();i++){
                        System.out.println(i+". "+FileManager.employees.get(i).toString());
                    }
                    System.out.println("What employee do you wanna lower position? ");
                    int i4=in.nextInt();
                    DepartmentManager.lowerPosition(FileManager.employees.get(i4));
                    FileManager.saveEmployee(FileManager.employees);
                    break;
                case 8:
                    groupEmployee(FileManager.employees);
                    break;
                case 9:
                    sortEmployeeBySalary(FileManager.employees);
                    break;
                case 10:
                    highestEmployees(FileManager.employees);
                    break;

            }
        }while (true);
    }
}
