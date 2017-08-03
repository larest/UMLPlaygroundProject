
public class Boss extends EmployeeBoss{
    private final Person person = new Person();
    private final HRBoss hrBoss;

    public Boss(String name, String surname, String position, HRBoss hrBoss) {
        super(name, surname, position);
        this.hrBoss = hrBoss;
    }

    public void hireCandidate(String position){
        hrBoss.requestForNewEmployee(position);
    }
}
