/**
 * Created by andrewm on 11/07/17.
 */
public class Company implements Unit {
    private Department[] departments;
    public Boss ceo;

    private String name;

    public String getName() {
        return name;
    }

    public Boss getCeo() {
        return ceo;
    }

    public void setCeo(Boss ceo) {
        this.ceo = ceo;
    }

    public Boss getPresident() {
        return president;
    }

    public void setPresident(Boss president) {
        this.president = president;
    }

    public Boss president;


    public int getPersonCount() {
        int count=0;
        for (int i=0; i<departments.length; i++){
            count+=departments[i].getPersonCount();
        }
        return count;
    }
}
