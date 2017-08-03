public class HRBoss extends Employee {
    private final Person person = new Person();
    private HRDepartament department;

    public HRBoss(String name, String surname, String position) {
        super(name, surname, position);
    }

    public Person[] requestForNewEmployee(String position){
        return department.findCandidates(position);
    }
}
