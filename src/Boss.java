
public class Boss extends AbstractBoss {

    private final HRBoss hrBoss;

    public Boss(String name, String surname, String position, HRBoss hrBoss) {
        super(name, surname, position);
        this.hrBoss = hrBoss;
    }

    public void hire(String position){
        hrBoss.requestForNewEmployee(position);
    }
}
