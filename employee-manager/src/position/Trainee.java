package position;

import position.Position;

import java.math.BigDecimal;

public class Trainee implements Position {

    private String name;
    private Department department;
    private BigDecimal salary;

    public Trainee(String name, Department department, BigDecimal salary){
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public Trainee(){}

    public String getName(){return name;}

    public Department getDepartment(){return department;}
    public BigDecimal getMinSalary(){return BigDecimal.valueOf(300);}
    public BigDecimal getMaxSalary(){return BigDecimal.valueOf(600);}


}
