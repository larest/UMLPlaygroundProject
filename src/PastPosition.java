
public class PastPosition {
    private String name;
    private Workgroup workgroup;
    public PastPosition(String position, Workgroup workgroup){
        name = position;
        this.workgroup = workgroup;
    }
    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }
    public void setWorkgroup(Workgroup d){
        workgroup = d;
    }
    public Workgroup getWorkgroup(){
        return workgroup;
    }
}
