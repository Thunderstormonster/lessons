import position.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Accounting {
    public static void changeSalary(Employee employee, BigDecimal salary){
            if(salary.compareTo(employee.getPosition().getMinSalary())>0&&salary.compareTo(employee.getPosition().getMaxSalary())<0){
                employee.setSalary(salary);
                employee.setLastChangeOfSalary(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
            }else{
                System.out.println("Choose right amount of salary("+employee.getPosition().getMinSalary()+"-"+employee.getPosition().getMaxSalary()+")");

            }

    }
}
