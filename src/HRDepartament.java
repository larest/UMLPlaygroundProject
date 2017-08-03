import java.util.*;

public class HRDepartament implements Unit {
    private final String name = "HRDepartment";
    private Workgroup[] workgroups;
    private HRBoss boss;

    public HRDepartament(Workgroup[] workgroups) {
        this.workgroups = workgroups;
    }


    public String getName() {
        return name;
    }

    public HRBoss getBoss() {
        return boss;
    }

    public void setBoss(HRBoss boss) {
        this.boss = boss;
    }

    public int getPersonCount() {
        int count=0;
        for (int i=0; i<workgroups.length; i++){
            count+=workgroups[i].getPersonCount();
        }
        return count;
    }

    public Person[] findCandidates(String position){
        return collectCandidates(position);
    }

    private Person[] collectCandidates(String position){
        List<Person> persons = new ArrayList<Person>();
        for (int i=0; i<workgroups.length; i++){
            Set<Employee> employees = workgroups[i].getEmployees();
            for (Employee employee: employees){
                if(employee.getPosition() == position)
                {
                    persons.add( employee.getPerson());
                }
            }
        }
        return (Person[]) persons.toArray();
    }
}
