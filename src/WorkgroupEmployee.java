/**
 * Created by andrewm on 24/07/17.
 */
public class WorkgroupEmployee extends Employee{

    private final Person person = new Person();

    public Workgroup getWorkgroup() {
        return workgroup;
    }

    public void setWorkgroup(Workgroup workgroup) {
        this.workgroup = workgroup;
    }

    private Workgroup workgroup;

    public WorkgroupEmployee(String name, String surname, String position) {
        super(name, surname, position);
    }
}
