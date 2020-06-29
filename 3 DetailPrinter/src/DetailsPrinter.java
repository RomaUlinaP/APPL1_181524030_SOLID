
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RomaUlina
 */
public class DetailsPrinter {
    private List<Employee> employees;
    
    public DetailsPrinter(List<Employee> Employees){
        this.employees = Employees;
    }
    
    public void printDetails(){
        for(Employee employee :this.employees){
            System.out.println(employee.ToString());
        }
    }
}
