import position.Manager;
import position.SeniorManager;


import java.math.BigDecimal;
import java.util.ArrayList;


public class FileManager {
    public static ArrayList<Employee> employees=new ArrayList<>(){{
        add(new Employee("Timothy","Dalton",192,new Manager(),"12/02/2000", BigDecimal.valueOf(300),"25/12/2022"));
        add(new Employee("Anna","May",188,new SeniorManager(),"02/03/2010", BigDecimal.valueOf(900),"23/05/2015"));
    }};

    public static void addEmployee(Employee employee){
        employees.add(employee);
    }

    public static void removeEmployee(Employee employee){
        employees.remove(employee);
    }


}
