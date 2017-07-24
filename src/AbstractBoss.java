/**
 * Created by andrewm on 24/07/17.
 */
abstract class AbstractBoss extends Employee {
    protected final Person person = new Person();

    public AbstractBoss(String name, String surname, String position) {
        super(name, surname, position);
    }
}
