import position.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

//Текущая зарплата сотрудника должна быть в рамках его
// должности и отдела: маркетинг - trainee (от 300 до 600),
// specialist (от 500 до 1200), head of marketing (от 1000 до 2000);
// hr - manager (от 400 до 800), senior manager (от 700 до 1100),
// head of hr (от 800 до 1700); разработка - junior developer (от 400 до 1000),
// middle developer (от 800 до 2000), senior developer (от 1800 до 4000),
// team lead (от 2500 до 7000).

public class Accounting {
    public static void changeSalary(Employee employee, BigDecimal salary){
        if(employee.getPosition() instanceof Trainee){
            if(salary.compareTo(employee.getPosition().getMinSalary())>0&&salary.compareTo(employee.getPosition().getMaxSalary())<0){
                employee.setSalary(salary);
                employee.setLastChangeOfSalary(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            }else{
                System.out.println("Choose right amount of salary(300-600)");
            }
        }else if(employee.getPosition() instanceof Specialist){
            if(salary.compareTo(employee.getPosition().getMinSalary())>0&&salary.compareTo(employee.getPosition().getMaxSalary())<0){
                employee.setSalary(salary);
                employee.setLastChangeOfSalary(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            }else{
                System.out.println("Choose right amount of salary(500-1200)");
            }
        }else if(employee.getPosition() instanceof HeadOfMarketing){
            if(salary.compareTo(employee.getPosition().getMinSalary())>0&&salary.compareTo(employee.getPosition().getMaxSalary())<0){
                employee.setSalary(salary);
                employee.setLastChangeOfSalary(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            }else{
                System.out.println("Choose right amount of salary(1000-2000)");
            }
        }else if(employee.getPosition() instanceof Manager){
            if(salary.compareTo(employee.getPosition().getMinSalary())>0&&salary.compareTo(employee.getPosition().getMaxSalary())<0){
                employee.setSalary(salary);
                employee.setLastChangeOfSalary(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            }else{
                System.out.println("Choose right amount of salary(400-800)");
            }
        }else if(employee.getPosition() instanceof SeniorManager){
            if(salary.compareTo(employee.getPosition().getMinSalary())>0&&salary.compareTo(employee.getPosition().getMaxSalary())<0){
                employee.setSalary(salary);
                employee.setLastChangeOfSalary(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            }else{
                System.out.println("Choose right amount of salary(700-1100)");
            }
        }else if(employee.getPosition() instanceof HeadOfHR){
            if(salary.compareTo(employee.getPosition().getMinSalary())>0&&salary.compareTo(employee.getPosition().getMaxSalary())<0){
                employee.setSalary(salary);
                employee.setLastChangeOfSalary(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            }else{
                System.out.println("Choose right amount of salary(800-1700)");
            }
        }else if(employee.getPosition() instanceof JuniorDeveloper){
            if(salary.compareTo(employee.getPosition().getMinSalary())>0&&salary.compareTo(employee.getPosition().getMaxSalary())<0){
                employee.setSalary(salary);
                employee.setLastChangeOfSalary(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            }else{
                System.out.println("Choose right amount of salary(400-1000)");
            }
        }else if(employee.getPosition() instanceof MiddleDeveloper){
            if(salary.compareTo(employee.getPosition().getMinSalary())>0&&salary.compareTo(employee.getPosition().getMaxSalary())<0){
                employee.setSalary(salary);
                employee.setLastChangeOfSalary(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            }else{
                System.out.println("Choose right amount of salary(800-2000)");
            }
        }else if(employee.getPosition() instanceof SeniorDeveloper){
            if(salary.compareTo(employee.getPosition().getMinSalary())>0&&salary.compareTo(employee.getPosition().getMaxSalary())<0){
                employee.setSalary(salary);
                employee.setLastChangeOfSalary(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            }else{
                System.out.println("Choose right amount of salary(1800-4000)");
            }
        }else if(employee.getPosition() instanceof TeamLead){
            if(salary.compareTo(employee.getPosition().getMinSalary())>0&&salary.compareTo(employee.getPosition().getMaxSalary())<0){
                employee.setSalary(salary);
                employee.setLastChangeOfSalary(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            }else{
                System.out.println("Choose right amount of salary(2500-7000)");
            }
        }
    }
}
