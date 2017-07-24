
public class Department extends AbstractDepartment {
    private Boss director;

    public void setName(String name) {
        this.name = name;
    }



    public Boss getDirector() {
        return director;
    }

    public void setDirector(Boss director) {
        this.director = director;
    }


}
