import java.util.HashSet;
import java.util.Set;

/**
 * Created by andrewm on 11/07/17.
 */
public class Workgroup implements Unit {
    private Set<Employee> employees = new HashSet<Employee>();


    Boss teamleader;

    private String name;

    public Workgroup(String n){
        name = n;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void addEmployee(WorkgroupEmployee newEmployee){
        employees.add(newEmployee);
        // связываем сотрудника с этим отделом
        newEmployee.setWorkgroup(this);
    }
    public Set getEmployees(){
        return employees;
    }
    public void removeEmployee(Employee e){
        employees.remove(e);
    }
    public Boss getTeamleader() {
        return teamleader;
    }

    public void setTeamleader(Boss teamleader) {
        this.teamleader = teamleader;
    }

    @Override
    public int getPersonCount() {
        return employees.size();
    }
}
