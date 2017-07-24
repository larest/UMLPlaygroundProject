/**
 * Created by andrewm on 24/07/17.
 */
public class AbstractDepartment implements Unit {
    protected String name;
    Workgroup[] workgroups;

    public String getName() {
        return name;
    }

    public int getPersonCount() {
        int count=0;
        for (int i=0; i<workgroups.length; i++){
            count+=workgroups[i].getPersonCount();
        }
        return count;
    }
}
