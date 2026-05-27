package Banco;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
private int id;
private String name;
private Double salary;

public Pessoa() {
}

public Pessoa(int id, String name, Double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
}

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public Double getSalary() {
    return salary;
}

public void setSalary(Double salary) {
    this.salary = salary;
}

@Override
public String toString(){
    return "Id: " + id +" | name: "+ name +" | Salary: " + salary;
}

void aumento(double a1){
    double porcentagem = a1 / 100.0;
    this.salary += porcentagem * salary;
}

}
