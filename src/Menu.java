
public  class Menu{
    private static int i=0;
    public static void showEmployees(EmployeeBoss[] employees){
        System.out.println("Список сотрудников:");
        for (i=0; i<employees.length; i++){
            if(employees[i] != null ){
                System.out.println(employees[i].getPerson().getName() +" - " + employees[i].getPosition());
            }
        }
    }
}
