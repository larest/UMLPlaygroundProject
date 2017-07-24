/**
 * Created by andrewm on 24/07/17.
 */
public class HRDepartment extends AbstractDepartment {
    private final String name = "HRDepartment";

    private HRBoss director;

    public HRBoss getDirector() {
        return director;
    }

    public void setDirector(HRBoss director) {
        this.director = director;
    }

    public Person[] findCandidates(String position){
        return collectCandidates(position);
    }

    private Person[] collectCandidates(String position){
        Person[] persons = new Person[10];
        return persons;
    }
}
