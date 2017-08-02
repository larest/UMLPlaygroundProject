import java.util.HashSet;
import java.util.Set;

/**
 * Created by andrewm on 11/07/17.
 */
public class Employee {

    public Workgroup getWorkgroup() {
        return workgroup;
    }

    public void setWorkgroup(Workgroup workgroup) {
        this.workgroup = workgroup;
    }

    private Workgroup workgroup;

    public Employee(){
    }
}
