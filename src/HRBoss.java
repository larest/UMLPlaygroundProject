/**
 * Created by andrewm on 24/07/17.
 */
public class HRBoss extends AbstractBoss {

    HRDepartment department;

    public HRBoss(String name, String surname, HRDepartment department) {
        super(name, surname, "HRBoss");
        this.department = department;
        this.department.setDirector(this);
    }

    public Person[] requestForNewEmployee(String position){
       return department.findCandidates(position);
    }

}
