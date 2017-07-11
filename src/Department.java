
public class Department implements Unit {
    Workgroup[] workgroups;
    private Boss director;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Boss getDirector() {
        return director;
    }

    public void setDirector(Boss director) {
        this.director = director;
    }




    public int getPersonCount() {
        int count=0;
        for (int i=0; i<workgroups.length; i++){
            count+=workgroups[i].getPersonCount();
        }
        return count;
    }
}
