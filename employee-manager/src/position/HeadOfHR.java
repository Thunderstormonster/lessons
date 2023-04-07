package position;

import position.Department;
import position.Position;

import java.math.BigDecimal;

public class HeadOfHR implements Position {
    private String name;
    private Department department;
    private BigDecimal salary;

    public HeadOfHR(String name, Department department, BigDecimal salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public HeadOfHR(){}

    public String getName(){return name;}

    public Department getDepartment(){return department;}
    public BigDecimal getMinSalary(){return BigDecimal.valueOf(800);}
    public BigDecimal getMaxSalary(){return BigDecimal.valueOf(1700);}
}
