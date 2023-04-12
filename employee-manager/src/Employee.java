import position.Department;
import position.Position;

import java.io.Serializable;
import java.math.BigDecimal;

public class Employee implements Serializable {
    private String name;
    private String surname;
    private int id;
    private Position position;
    private String dateOfEmployment;
    private BigDecimal salary;
    private String lastChangeOfSalary;

    public Employee(){}

    public Employee(String name,String surname, int id,Position position,String dateOfEmployment,BigDecimal salary,String lastChangeOfSalary){
        this.name=name;
        this.surname=surname;
        this.id=id;
        this.position=position;
        this.dateOfEmployment=dateOfEmployment;
        this.salary=salary;
        this.lastChangeOfSalary=lastChangeOfSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setLastChangeOfSalary(String lastChangeOfSalary) {
        this.lastChangeOfSalary = lastChangeOfSalary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getLastChangeOfSalary() {
        return lastChangeOfSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", position=" + position +
                ", dateOfEmployment='" + dateOfEmployment + '\'' +
                ", salary=" + salary +
                ", lastChangeOfSalary='" + lastChangeOfSalary + '\'' +
                '}';
    }
}
